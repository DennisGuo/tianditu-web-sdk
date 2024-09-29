package cn.ghx.tianditu.common.data;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 推荐行政区
 */
@Data
@NoArgsConstructor
public class PriorityCity {
    /**
     * 行政区名称 	String 	必返回
     */
    private String name;
    /**
     * 城市数量 	Int 	必返回
     */
    private Integer count;
    /**
     * 行政区经纬度 	String 	必返回 	坐标 x，y
     */
    private String lonlat;
    /**
     * 英文行政名称 	String 	必返回
     */
    private String ename;
    /**
     * 城市国标码 	Int 	必返回 	9位国标码。
     */
    private String adminCode;
}
