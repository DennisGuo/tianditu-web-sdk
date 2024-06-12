package cn.ghx.tianditu.drive.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 路径分段
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteItem {
    /**
     * 序号
     */
    private Integer id;
    /**
     * 每段线路文字描述
     */
    private String strguide;
    /**
     * “路牌”引导提示/高速路收费站出口信息
     */
    private String signage;
    /**
     * 当前路段名称
     */
    private String streetName;
    /**
     * 下一段道路名称
     */
    private String nextStreetName;
    /**
     * 道路收费信息(0=免费路段，1=收费路段，2=部分收费路段)
     */
    private Integer tollStatus;
    /**
     * 转折点经纬度
     */
    private String turnlatlon;
}
