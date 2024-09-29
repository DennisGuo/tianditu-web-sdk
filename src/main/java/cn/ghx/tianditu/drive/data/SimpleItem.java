package cn.ghx.tianditu.drive.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分段线路信息
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleItem {
    /**
     * 序号
     */
    private Integer id;
    /**
     * 每段线路文字描述
     */
    private String strguide;
    /**
     * 当前行驶路段名称（含多个路段）
     */
    private String streetNames;
    /**
     * 最后一段道路名称
     */
    private String lastStreetName;
    /**
     * 合并段之间衔接的道路名称
     */
    private String linkStreetName;
    /**
     * 路牌”引导提示/高速路收费站出口信息
     */
    private String signage;
    /**
     * 道路收费信息(0=免费路段，1=收费路段，2=部分收费路段)
     */
    private Integer tollStatus;
    /**
     * 折点经纬度
     */
    private String turnlatlon;
    /**
     * 线路经纬度
     */
    private String streetLatLon;
    /**
     * 行驶总距离（单位：米）
     */
    private String streetDistance;
    /**
     * 合并后的号段，对应详细描述中的号段
     */
    private String segmentNumber;
}
