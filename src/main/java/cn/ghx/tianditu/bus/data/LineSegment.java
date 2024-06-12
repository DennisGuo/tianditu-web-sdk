package cn.ghx.tianditu.bus.data;

import lombok.Data;

import java.util.List;

@Data
public class LineSegment {
    /**
     * 线路类型
     * 参见(3)。
     */
    private String segmentType;
    /**
     * 起站点内容
     */
    private LineStation stationStart;
    /**
     * 终站点内容
     */
    private LineStation stationEnd;
    /**
     * 线路内容 	JSONObject 		参见segmentLine。
     */
    private List<SegmentLine> segmentLine;
}
