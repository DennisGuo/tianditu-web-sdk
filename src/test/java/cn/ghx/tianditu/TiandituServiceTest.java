package cn.ghx.tianditu;

import cn.ghx.tianditu.coder.data.GeoCoderAddressResult;
import cn.ghx.tianditu.coder.data.GeoCoderLocationResult;
import cn.ghx.tianditu.place.data.PlaceSearchResult;
import cn.ghx.tianditu.place.params.PlaceSearchParams;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TiandituServiceTest {

    private static final String tk = "d66ce314582f270fef7bf0e3bd6b17a7";

    private static TiandituService service;

    @BeforeAll
    public static void init() {
        service = new TiandituService(tk);
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
}