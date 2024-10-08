package cn.ghx.tianditu.common.data;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 车站信息结构体
 */
@Data
@NoArgsConstructor
public class StationData {
    /**
     * 线路名称 	String 	必返回
     */
    private String lineName;
    /**
     * 线路的id 	String 	必返回
     */
    private String uuid;

    /**
     * 公交站uuid 	String 	必返回
     */
    private String stationUuid;
}
