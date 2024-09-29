package cn.ghx.tianditu.bus;

import cn.ghx.tianditu.bus.data.BusLineResult;
import cn.ghx.tianditu.bus.data.LineDetailResult;
import cn.ghx.tianditu.bus.data.LineStation;
import cn.ghx.tianditu.bus.params.BusLineParams;
import cn.ghx.tianditu.common.BaseService;

import java.io.IOException;

/**
 * 公交规划
 * 1. 公交规划
 * 2. ID搜索线路详情
 * 3. 站点返程线路查询
 * 4.
 */
public class BusService extends BaseService {

    /**
     * 构造函数
     * @param tk 天地图密钥
     */
    public BusService(String tk) {
        super(tk);
    }

    /**
     * 公交规划
     * 根据输入起点和终点查询公交地铁规划线路
     *
     * @param params BusLineParams
     * @return BusLineResult
     * @throws IOException 异常
     */
    public BusLineResult getBusLine(BusLineParams params) throws IOException {
        String url = "/transit?type=busline&postStr=" + gson.toJson(params);
        return request(url, BusLineResult.class);
    }

    /**
     * ID搜索请求
     * 根据提供的docid 搜索内容，主要是根据前端给的id 搜索公交站和公交线的详细信息
     *
     * @param uuid 线路的ID
     * @return LineDetailResult
     * @throws IOException 异常
     */
    public LineDetailResult getLineDetail(String uuid) throws IOException {
        String url = "/transit?type=busline&postStr={\"uuid\":\"" + uuid + "\"}";
        return request(url, LineDetailResult.class);
    }

    /**
     * 站点返程线路查询
     * 站点返程线路查询是查询经过一个站点的线路是否有反向的线路，即查询经过此战的此线路是否为双向成对的线路。
     *
     * @param uuid 站点的ID
     * @return LineStation
     * @throws IOException 异常
     */
    public LineStation getStationDetail(String uuid) throws IOException {
        String url = "/transit?type=busline&postStr={\"uuid\":\"" + uuid + "\"}";
        return request(url, LineStation.class);
    }

    /**
     * 站点返程线路查询
     * 站点返程线路查询是查询经过一个站点的线路是否有反向的线路，即查询经过此战的此线路是否为双向成对的线路。
     *
     * @param lineUuid    线路的ID
     * @param stationUuid 站点的ID
     * @return LineDetailResult
     * @throws IOException 异常
     */
    public LineDetailResult getStationReturnRoute(String lineUuid, String stationUuid) throws IOException {
        String url = "/transit?type=busline&postStr={\"lineUuid\":\"" + lineUuid + "\",\"stationUuid\":\"" + stationUuid + "\"}";
        return request(url, LineDetailResult.class);
    }
}
