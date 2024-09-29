package cn.ghx.tianditu.coder;

import cn.ghx.tianditu.coder.data.GeoCoderAddressResult;
import cn.ghx.tianditu.coder.data.GeoCoderLocationResult;
import cn.ghx.tianditu.common.BaseService;

import java.io.IOException;

/**
 * 地理编码 / 逆地理编码查询
 */
public class GeoCoderService extends BaseService {
    /**
     * 构造函数
     * @param tk 天地图密钥
     */
    public GeoCoderService(String tk) {
        super(tk);
    }

    /**
     * 地理编码
     * 由结构化地址数据（如：北京市海淀区莲花池西路28号）转换为对应坐标点（经纬度）功能
     *
     * @param address 地址 如：北京市海淀区莲花池西路28号
     * @return GeoCoderLocationResult
     * @throws IOException 异常
     */
    public GeoCoderLocationResult addressToLocation(String address) throws IOException {
        String uri = "/geocoder?ds={\"keyWord\":\"" + address + "\"}";
        return super.request(uri, GeoCoderLocationResult.class);
    }

    /**
     * 逆地理编码查询
     * 提供将坐标点（经纬度）转换为结构化的地址信息的功能
     *
     * @param lon 经度
     * @param lat 纬度
     * @return GeoCoderAddressResult
     * @throws IOException 异常
     */
    public GeoCoderAddressResult locationToAddress(Double lon, Double lat) throws IOException {
        String uri = "/geocoder?type=geocode&postStr={\"lon\":" + lon + ",\"lat\":" + lat + ",\"ver\":1}";
        return super.request(uri, GeoCoderAddressResult.class);
    }

}
