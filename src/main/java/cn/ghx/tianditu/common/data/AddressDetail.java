package cn.ghx.tianditu.common.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressDetail {

    /**
     * 此点最近地点信息
     */
    private String address;
    /**
     * 此点在最近地点信息方向
     */
    private String address_position;

    /**
     * 此点距离最近地点信息距离
     */
    private Integer address_distance;
    /**
     * 国家
     */
    private String nation;
    /**
     * 省份
     */
    private String province;
    /**
     * 省份编码
     */
    private String province_code;
    /**
     * 此点所在国家或城市或区县
     */
    private String city;
    /**
     * 城市编码
     */
    private String city_code;
    /**
     * 区县
     */
    private String county;
    /**
     * 区县编码
     */
    private String county_code;

    /**
     * 距离此点最近的路
     */
    private String road;
    /**
     * 此点距离此路的距离
     */
    private Integer road_distance;

    /**
     * 距离此点最近poi点
     */
    private String poi;
    /**
     * 此点在最近poi点的方向
     */
    private String poi_position;
    /**
     * 距离此点最近poi点的距离
     */
    private String poi_distance;

}
