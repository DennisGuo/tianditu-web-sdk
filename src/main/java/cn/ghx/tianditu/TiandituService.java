package cn.ghx.tianditu;

import cn.ghx.tianditu.administrative.AdministrativeService;
import cn.ghx.tianditu.bus.BusService;
import cn.ghx.tianditu.coder.GeoCoderService;
import cn.ghx.tianditu.drive.DriveService;
import cn.ghx.tianditu.image.StaticImageService;
import cn.ghx.tianditu.place.PlaceSearchService;

/**
 * 天地图WEB服务
 */
public class TiandituService {


    public static final String URI = "https://api.tianditu.gov.cn";


    /**
     * 申请的密钥
     */
    private String tk;


    /**
     * 获取天地图WEB服务对象
     *
     * @param tk 申请的密钥
     */
    public TiandituService(String tk) {
        this.tk = tk;
    }

    /**
     * 获取 地名搜索V2.0 服务
     *
     * @return PlaceSearchService
     */
    public PlaceSearchService getPlaceSearchService() {
        return new PlaceSearchService(tk);
    }

    /**
     * 地理编码 / 逆地理编码查询 服务
     *
     * @return GeoCoderService
     */
    public GeoCoderService getGeoCoderService() {
        return new GeoCoderService(tk);
    }

    /**
     * 行政区划服务V2.0
     *
     * @return AdministrativeService
     */
    public AdministrativeService getAdministrativeService() {
        return new AdministrativeService(tk);
    }

    /**
     * 驾车规划服务
     *
     * @return DriveService
     */
    public DriveService getDriveServiceService() {
        return new DriveService(tk);
    }

    /**
     * 静态地图API
     *
     * @return StaticImageService
     */
    public StaticImageService getStaticImageService() {
        return new StaticImageService(tk);
    }

    /**
     * 公交规划服务
     *
     * @return BusService
     */
    public BusService getBusService() {
        return new BusService(tk);
    }
}
