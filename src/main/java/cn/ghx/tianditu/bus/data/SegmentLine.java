package cn.ghx.tianditu.bus.data;

import lombok.Data;

/**
 * 线路内容
 */
@Data
public class SegmentLine {

    /**
     * id，可以用于查询路线详情
     */
    private String byuuid;
    /**
     * 线路名称
     */
    private String lineName;
    /**
     * 运营时间段
     */
    private String SEndTime;
    /**
     * 此段线路的线路名（不包含括号中的内容）
     */
    private String segmentName;
    /**
     * 此段线路的完整线路名
     */
    private String direction;
    /**
     * 此段线路的坐标
     */
    private String linePoint;
    /**
     * 一条线路中每小段距离，如果此段是步行且距离小于20米，不返回此线段 	Int
     */
    private Double segmentDistance;
    /**
     * 此段线路需要经过的站点数
     */
    private Integer segmentStationCount;
    /**
     * 此段线路需要的时间
     */
    private Integer segmentTime;
    /**
     * 换站时间
     */
    private Integer segmentTransferTime;
}
