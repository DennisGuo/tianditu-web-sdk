package cn.ghx.tianditu.bus.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 公交路线对象
 */
@Data
@NoArgsConstructor
public class BusLineItem {
    /**
     * 线路结果类型
     * 第0位为1，较快捷；
     * 第1位为1，少换乘；
     * 第2位为1，少步行；
     * 第3位为1，不坐地铁；
     */
    private Integer lineType;
    /**
     * 公交结果线路(相对应类型的所有线路，最多5条)
     * 数组中每个对象为一条由起点到终点的公交规划线路
     */
    private List<BusLineDetail> lines;

}
