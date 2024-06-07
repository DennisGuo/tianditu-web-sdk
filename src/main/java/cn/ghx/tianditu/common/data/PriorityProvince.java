package cn.ghx.tianditu.common.data;

import lombok.Data;

/**
 * 各省包含信息
 */
@Data
public class PriorityProvince {

    /**
     * 行政名称 	String 	必返回
     */
    private String name;
    /**
     * 包含数量 	Int 	必返回
     */
    private String count;
    /**
     * 行政区经纬度 	String 	必返回 	坐标x,y
     */
    private String lonlat;
    /**
     * 省国标码 	String 	必返回
     */
    private String adminCode;
    /**
     * 英文行政名称 	String 	必返回
     */
    private String ename;
    /**
     * 有无下一级行政区 	boolean 	必返回 	有则false，无则true
     */
    private String isleaf;
}
