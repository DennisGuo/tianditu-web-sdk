package cn.ghx.tianditu.place;

import cn.ghx.tianditu.common.BaseService;
import cn.ghx.tianditu.place.data.PlaceSearchResult;
import cn.ghx.tianditu.place.params.PlaceSearchParams;

import java.io.IOException;

/**
 * 地名搜索V2.0
 * <p>
 * 1.1 行政区划区域搜索服务
 * 1.2 视野内搜索服务
 * 1.3 周边搜索服务
 * 1.4 多边形搜索服务
 * 1.5 数据分类搜索服务
 * 1.6 普通搜索服务
 * 1.7 统计搜索服务
 */
public class PlaceSearchService extends BaseService {

    public PlaceSearchService(String tk) {
        super(tk);
    }

    public PlaceSearchResult search(PlaceSearchParams params) throws IOException {
        return sendSearchRequest(params);
    }

    private PlaceSearchResult sendSearchRequest(Object params) throws IOException {
        String postStr = gson.toJson(params);
        String uri = "/v2/search?type=query&postStr=" + postStr;
        return super.request(uri, PlaceSearchResult.class);
    }
}
