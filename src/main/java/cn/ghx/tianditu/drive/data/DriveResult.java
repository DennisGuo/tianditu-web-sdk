package cn.ghx.tianditu.drive.data;

import cn.ghx.tianditu.drive.params.DriveParams;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * 驾车规划结果对象
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriveResult {
    /**
     * 请求参数
     */
    private DriveParams parameters;
    /**
     * 全长（单位：公里）
     */
    private Double distance;
    /**
     * 行驶总时间（单位：秒）
     */
    private Double duration;
    /**
     * 线路经纬度字符串
     */
    private String routelatlon;
    /**
     * 地图显示信息
     */
    private DriveMapinfo mapinfo;
    /**
     * 分段线路信息
     */
    private List<RouteItem> routes;
    /**
     * 分段线路信息
     */
    private List<SimpleItem> simple;
}
