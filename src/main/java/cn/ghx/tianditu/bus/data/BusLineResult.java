package cn.ghx.tianditu.bus.data;

import lombok.Data;

import java.util.List;

@Data
public class BusLineResult {
    /**
     * 返回数据状态
     * 0 	正常返回线路。
     * 1 	找不到起点。
     * 2 	找不到终点。
     * 3 	规划线路失败。
     * 4 	起终点距离200米以内，不规划线路，建议步行。
     * 5 	起终点距离500米内，返回线路。
     * 6 	输入参数错误。
     */
    private Integer resultCode;
    /**
     * 所有返回线路中，是否有包含地铁的线路
     */
    private Boolean hasSubway;
    /**
     * 返回的整体结果 Json数组
     */
    private List<BusLineItem> results;
}
