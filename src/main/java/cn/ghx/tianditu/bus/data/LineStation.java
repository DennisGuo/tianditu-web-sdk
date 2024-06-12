package cn.ghx.tianditu.bus.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 站点内容
 */
@NoArgsConstructor
@Data
public class LineStation {

    /**
     * 站点坐标
     */
    private String lonlat;
    /**
     * 站点名称
     */
    private String name;
    /**
     * 站的id信息
     */
    private String uuid;

    /**
     * 站点线路
     */
    private List<LineData> linedata;
}
