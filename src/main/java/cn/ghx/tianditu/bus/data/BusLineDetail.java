package cn.ghx.tianditu.bus.data;

import lombok.Data;

import java.util.List;

@Data
public class BusLineDetail {
    /**
     * 单条公交规划结果所有线路名称
     * 如:3路—4路—5路。
     */
    private String lineName;
    /**
     * 单条公交结果中的各段线路信息。
     * 数组中的每个对象为此换乘线路中的分段线路。
     */
    private List<LineSegment> segments;
}