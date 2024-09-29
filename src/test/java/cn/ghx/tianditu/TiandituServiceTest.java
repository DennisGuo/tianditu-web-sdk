package cn.ghx.tianditu;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import cn.ghx.tianditu.administrative.data.AdministrativeResult;
import cn.ghx.tianditu.administrative.params.AdministrativeParams;
import cn.ghx.tianditu.bus.data.BusLineResult;
import cn.ghx.tianditu.bus.data.LineDetailResult;
import cn.ghx.tianditu.bus.data.LineStation;
import cn.ghx.tianditu.bus.params.BusLineParams;
import cn.ghx.tianditu.coder.data.GeoCoderAddressResult;
import cn.ghx.tianditu.coder.data.GeoCoderLocationResult;
import cn.ghx.tianditu.drive.data.DriveResult;
import cn.ghx.tianditu.drive.params.DriveParams;
import cn.ghx.tianditu.image.params.StaticImageParams;
import cn.ghx.tianditu.place.data.PlaceSearchResult;
import cn.ghx.tianditu.place.params.PlaceSearchParams;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class TiandituServiceTest {


    private static TiandituService service;

    static {
        /**
         * 设置日志级别
         */
        Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.setLevel(Level.ALL);
    }

    @BeforeAll
    public static void init() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/ghx/workspace/ghx/tianditu-web-sdk/local.properties"));
            String tk = properties.getProperty("tk");
            System.out.println("tk = " + tk);
            service = new TiandituService(tk);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void print(Object obj) {
        if (obj instanceof String) {
            System.out.println(obj);
        } else {
            System.out.println(new Gson().toJson(obj));
        }
    }

    @Test
    void searchSpecifyTest() throws IOException {
        PlaceSearchParams params = new PlaceSearchParams();
        params.setKeyWord("金开中心");
        params.setSpecify("156500000");

        PlaceSearchResult res = service.getPlaceSearchService().search(params);
        print(res);
    }

    @Test
    void searchBoundTest() throws IOException {
        PlaceSearchParams params = new PlaceSearchParams();
        params.setKeyWord("金开中心");
        params.setMapBound("-180,-90,180,90");
        params.setLevel("1");
//        params.setDataTypes("120100,120103");


        PlaceSearchResult res = service.getPlaceSearchService().search(params);
        print(res);
    }

    @Test
    void searchAroundTest() throws IOException {
        PlaceSearchParams params = new PlaceSearchParams();
        params.setKeyWord("饭店");
        params.setQueryRadius(5000);
        params.setPointLonlat("106.979513,29.254591");
        params.setShow("2");


        PlaceSearchResult res = service.getPlaceSearchService().search(params);
        print(res);
    }

    @Test
    void addressToLocationTest() throws IOException {
        GeoCoderLocationResult res = service.getGeoCoderService().addressToLocation("北京市海淀区莲花池西路28号");
        print(res);
    }

    @Test
    void locationToAddressTest() throws IOException {

        Double lon = 106.979513;
        Double lat = 29.254591;

        GeoCoderAddressResult res = service.getGeoCoderService().locationToAddress(lon, lat);
        print(res);
    }

    @Test
    void getAdministrativeTest() throws IOException {


        AdministrativeParams params = new AdministrativeParams();
        params.setKeyword("重庆市");
        params.setChildLevel(3);
        AdministrativeResult res = service.getAdministrativeService().getAdministrative(params);
        print(res);
    }

    @Test
    void getDriveRoutesTest() throws IOException {


        DriveParams params = new DriveParams();
        params.setOrig("116.35506,39.92277");
        params.setDest("116.39751,39.90854");
        params.setMid("116.36506,39.91277;116.37506,39.92077");
        DriveResult res = service.getDriveServiceService().getDriveRoutes(params);
        print(res);
    }

    @Test
    void getImageTest() throws IOException {

        StaticImageParams params = new StaticImageParams();
        params.setCenter("106.979513,29.254591");
        params.setZoom(16);
        params.setLayers("img_c,cva_c");

        byte[] image = service.getStaticImageService().getImage(params);

        if (image != null) {
            // 写入文件
            String path = "/Users/ghx/tmp/tmp-image.jpg";
            File file = new File(path);
            if (!file.exists()) {
                boolean rs = file.createNewFile();
                System.out.println("create file : " + path);
            }
            try (FileOutputStream out = new FileOutputStream(file)) {
                out.write(image);
            }
        }
    }

    @Test
    void getBusLineTest() throws IOException {


        BusLineParams params = new BusLineParams();
        params.setStartposition("116.427562,39.939677");
        params.setEndposition("116.349329,39.939132");
        BusLineResult res = service.getBusService().getBusLine(params);
        print(res);
    }

    @Test
    void getLineDetailByIdTest() throws IOException {

        LineDetailResult res = service.getBusService().getLineDetail("23212");
        print(res);
    }

    @Test
    void getStationDetailTest() throws IOException {

        LineStation res = service.getBusService().getStationDetail("135483");
        print(res);
    }

    @Test
    void getStationReturnRouteTest() throws IOException {

        LineDetailResult res = service.getBusService().getStationReturnRoute("23212", "135483");
        print(res);
    }
}