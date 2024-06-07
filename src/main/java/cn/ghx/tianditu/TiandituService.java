package cn.ghx.tianditu;

import cn.ghx.tianditu.coder.GeoCoderService;
import cn.ghx.tianditu.place.PlaceSearchService;
import org.slf4j.simple.SimpleLogger;

public class TiandituService {


    public static final String URI = "https://api.tianditu.gov.cn";

    static {
        /**
         * 设置日志级别
         */
        String level = System.getProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY);
        if (level == null) {
            System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
        }
    }

    /**
     * 申请的密钥
     */
    private String tk;


    /**
     * 获取天地图WEB服务对象
     *
     * @param tk 申请的密钥
     * @return
     */
    public TiandituService(String tk) {
        this.tk = tk;
    }

    /**
     * 获取 地名搜索V2.0 服务
     *
     * @return
     */
    public PlaceSearchService getPlaceSearchService() {
        return new PlaceSearchService(tk);
    }

    /**
     * 地理编码 / 逆地理编码查询 服务
     *
     * @return
     */
    public GeoCoderService getGeoCoderService() {
        return new GeoCoderService(tk);
    }
}
