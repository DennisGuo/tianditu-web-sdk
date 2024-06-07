package cn.ghx.tianditu.common;

import cn.ghx.tianditu.TiandituService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * 基础服务
 */
@Slf4j
public class BaseService {

    /**
     * gson 转换 json 字符串 和 对象
     */
    protected Gson gson = new Gson();
    /**
     * http 客户端
     */
    protected OkHttpClient client = new OkHttpClient();
    /**
     * 天地图密钥
     */
    private String tk;


    public BaseService(String tk) {
        this.tk = tk;
    }

    /**
     * 发送请求，
     *
     * @param uri   接口路径
     * @param clazz 返回的内容对象封装
     * @return
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
            return gson.fromJson(body, clazz);
        }
    }
}
