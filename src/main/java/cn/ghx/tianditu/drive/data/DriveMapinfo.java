package cn.ghx.tianditu.drive.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 地图显示范围
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriveMapinfo {
    /**
     * 全部结果同时显示的适宜中心经纬度
     */
    private String center;
    /**
     * 全部结果同时显示的适宜缩放比例
     */
    private Double scale;
}
