package cn.ghx.tianditu.drive.params;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 路线规划参数
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriveParams {
    /**
     * 起点经纬度
     * x,y 	-180,-90,180,90。
     */
    private String orig;
    /**
     * 终点经纬度
     * x,y 	-180,-90,180,90。
     */
    private String dest;
    /**
     * 途径点经纬度字符串
     * 途径点字符串格式：116.35506,39.92277;116.35506,39.92277
     * 两个坐标之间以分号隔开，坐标xy之间用逗号隔开(都是半角)。
     */
    private String mid;
    /**
     * 导航路线类型 	默认0 （0：最快路线，1：最短路线，2：避开高速，3：步行） 	0-3。
     */
    private Integer style = 0;
}
