package cn.ghx.tianditu.common.data;

import lombok.Data;

import java.util.List;

@Data
public class Poi {
    /**
     * Poi点名称 	String 	必返回
     */
    private String name;
    /**
     * 电话 	String
     */
    private String phone;
    /**
     * 地址 	String
     */
    private String address;
    /**
     * 坐标 	String 	必返回 	坐标 x，y
     */
    private String lonlat;
    /**
     * poi类型 	Int 	必返回 	101:POI数据 102:公交站点
     */
    private Integer poiType;
    /**
     * 英文地址 	String
     */
    private String eaddress;
    /**
     * poi点英文名称 	String
     */
    private String ename;
    /**
     * poi热点ID 	String 	必返回 	热点id
     */
    private String hotPointID;
    /**
     * 所属省名称 	String
     */
    private String province;
    /**
     * 省行政区编码 	String
     */
    private String provinceCode;
    /**
     * 所属城市名称 	String
     */
    private String city;
    /**
     * 市行政区编码 	String
     */
    private String cityCode;
    /**
     * 所属区县名称 	String
     */
    private String county;
    /**
     * 区县行政区编码 	String
     */
    private String countyCode;
    /**
     * 数据信息来源 	String 	必返回
     */
    private String source;
    /**
     * 分类编码 	String
     */
    private String typeCode;
    /**
     * 分类名称 	String
     */
    private String typeName;
    /**
     * 车站信息结构体 数据 poiType=102
     */
    private List<StationData> stationData;
}
