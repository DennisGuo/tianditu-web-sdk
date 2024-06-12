package cn.ghx.tianditu.bus.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 公交线路的详细信息
 */
@NoArgsConstructor
@Data
public class LineDetailResult {

    /**
     * 在索引中，对应的单独文章号码
     */
    private String byuuid;
    /**
     * 线路名称
     */
    private String linename;

    /**
     * 线路类型
     * 1：公交，2：地铁，3：磁悬浮。
     */
    private Integer linetype;
    /**
     * 始发车时间
     * 格式为：hh:mm 24小时制。
     */
    private String starttime;
    /**
     * 末班车时间
     * 格式为：hh:mm 24小时制。
     */
    private String endtime;
    /**
     * 发车间隔
     * 单位秒。
     */
    private Integer interval;

    /**
     * 站点数据
     */
    private List<LineStation> station;

    /**
     * 线路的详细点信息(坐标)
     * 点之间空格 隔开（x,y;x,y）。
     */
    private String linepoint;
    /**
     * 是否支持月票
     * 0：不支持，1： 支持。
     */
    private Integer ismonticket;
    /**
     * 该线路所具有的站点总数量
     * 整型。
     */
    private Integer stationnum;
    /**
     * 计费模式
     * 0，单一，1，按距离；2按站。
     */
    private String ticketcal;
    /**
     * 是否人工售票
     * 0：有人，1：无人。
     */
    private Integer ismanual;

    /**
     * 车站递增票价
     * 按站
     */
    private Integer increasedstep;
    /**
     * 递增距离票价
     * 按千米。
     */
    private Integer increasedprice;

    /**
     * 所属公交公司
     * 公交线路所属公司。
     */
    private String company;
    /**
     * 是否双向行驶
     * 0，单项；1， 双向。
     */
    private Integer isbidirectional;
    /**
     * 线路的长度
     * 单位米。
     */
    private Integer length;
    /**
     * 公交线路的全程运营总时间
     * 单位分钟。
     */
    private Integer totaltime;

    /**
     * 起步票价
     * 单位分。
     */
    private Integer startprice;

    /**
     * 全程票价
     * 单位分。
     */
    private Integer totalprice;

    /**
     * 状态(是否使用)
     * 0：使用中，1：非使用中。
     */
    private Integer status;
}
