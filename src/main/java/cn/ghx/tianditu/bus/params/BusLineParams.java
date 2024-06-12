package cn.ghx.tianditu.bus.params;

import lombok.Data;

/**
 * 公交规划请求参数
 */
@Data
public class BusLineParams {
    /**
     * 出发点坐标 “经度，纬度” 		String
     */
    private String startposition;
    /**
     * 终点坐标 “经度，纬度” 		String
     */
    private String endposition;
    /**
     * 获取线路规划类型(按位判断规划类型，以支持同时获取多种规划结果)
     * 第0位为1，较快捷；
     * 第1位为1，少换乘；
     * 第2位为1，少步行；
     * 第3位为1，不坐地铁。
     */
    private Integer linetype = 1;
}
