package cn.ghx.tianditu.common;

import cn.ghx.tianditu.TiandituService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * 基础服务
 */
@Slf4j
public class BaseService {

    /**
     * gson 转换 json 字符串 和 对象
     */
    protected Gson gson = new GsonBuilder()
            .registerTypeAdapter(Integer.class, new IntegerAdapter())
            .create();
    /**
     * http 客户端
     */
    protected OkHttpClient client = new OkHttpClient();
    /**
     * 天地图密钥
     */
    private String tk;

    /**
     * 构造函数
     * @param tk 天地图密钥
     */
    public BaseService(String tk) {
        this.tk = tk;
    }

    /**
     * 发送请求，
     *
     * @param uri   接口路径
     * @param clazz 返回的内容对象封装
     * @return 结果对象
     * @throws IOException 异常
     */
    protected <T> T request(String uri, Class<T> clazz) throws IOException {
        String url = TiandituService.URI + uri + "&tk=" + tk;
        log.trace("request url = {}", url);
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            assert response.body() != null;
            String body = response.body().string();
            log.trace("response = {}", body);

            // 异常处理
            String contentType = response.header("Content-Type");
            log.trace("response[Content-Type] = {}", contentType);
            assert contentType != null;
            if (contentType.contains("json")) {
                JsonObject obj = gson.fromJson(body, JsonObject.class);
                if (obj.has("code") && obj.get("code").getAsInt() != 0) {
                    throw new TiandituException(body);
                }
                return gson.fromJson(body, clazz);
            } else if (body.startsWith("<?xml")) {
                XmlMapper mapper = new XmlMapper();
                mapper.configure(FromXmlParser.Feature.EMPTY_ELEMENT_AS_NULL, true);
                return mapper.readValue(body, clazz);
            }
            return (T) body;
        }
    }

    /**
     * http获取字节数组
     * @param uri   http 地址
     * @return byte[] 数组
     * @throws IOException 异常
     */
    public byte[] requestBytes(String uri) throws IOException {
        String url = TiandituService.URI + uri + "&tk=" + tk;
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            ResponseBody body = response.body();
            if (body == null) {
                throw new TiandituException("Body is null.");
            }
            return body.bytes();
        }
    }
}
