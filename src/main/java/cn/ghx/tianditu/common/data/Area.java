package cn.ghx.tianditu.common.data;

import lombok.Data;

/**
 * 针对行政区省（类型3）集合点 	Json 数组 		resultType=3
 */
@Data
public class Area {
    /**
     * 名称 	String 	必返回
     */
    private String name;
    /**
     * 定位范围(“minx,miny,maxx,maxy”) 	String 	返回
     */
    private String bound;
    /**
     * 定位中心点坐标 	String 	必返回
     */
    private String lonlat;
    /**
     * 行政区编码 	Int 	必返回
     */
    private Integer adminCode;
    /**
     * 显示级别 	Int 	必返回 	1-18级
     */
    private Integer level;
}
