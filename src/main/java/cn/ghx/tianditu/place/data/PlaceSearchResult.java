package cn.ghx.tianditu.place.data;

import cn.ghx.tianditu.common.data.Area;
import cn.ghx.tianditu.common.data.Line;
import cn.ghx.tianditu.common.data.Poi;
import cn.ghx.tianditu.common.data.Status;
import lombok.Data;

import java.util.List;

/**
 * 地名搜索V2.0 返回结果基类
 */
@Data
public class PlaceSearchResult {
    /**
     * 返回结果类型 : 取值1-5，对应不同的响应类型：
     * 1（普通POI），
     * 2（统计），
     * 3（行政区)，
     * 4（建议词搜索），
     * 5（线路结果）
     */
    private Integer resultType;

    /**
     * 返回总条数
     */
    private Integer count;
    /**
     * 搜索关键词
     */
    private String keyword;

    /**
     * 针对点（类型1）集合返回： resultType=1
     */
    private List<Poi> pois;
    /**
     * statistics 	针对统计（类型2）集合返回 	Json 数组 		resultType=2
     */
    private List<PlaceStatistic> statistics;
    /**
     * 针对行政区省（类型3）集合点 	Json 数组 		resultType=3
     */
    private List<Area> area;
    /**
     * lineData 	线路结果 	Json 数组 		resultType=5
     */
    private List<Line> lineData;
    /**
     * 返回状态信息 	Json 数组 	必返回 	结果提示信息
     */
    private Status status;

}
