package cn.ghx.tianditu.common.data;

import lombok.Data;

/**
 * 线路
 */
@Data
public class Line {
    /**
     * 站数量 	String 	必返回
     */
    private String stationNum;
    /**
     * 类型为“103” 	String 	必返回
     */
    private String poiType;
    /**
     * 线路名称 	String 	必返回
     */
    private String name;
    /**
     * 线路id 	String 	必返回
     */
    private String uuid;
}
