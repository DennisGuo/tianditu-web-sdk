package cn.ghx.tianditu.place.data;

import cn.ghx.tianditu.common.data.PriorityCity;
import cn.ghx.tianditu.common.data.PriorityProvince;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 针对统计（类型2）集合返回
 */
@Data
@NoArgsConstructor
public class PlaceStatistic {

    /**
     * 本次统计POI总数量 	Int 	必返回
     */
    private Integer count;
    /**
     * 行政区数量 	Int 	必返回
     */
    private Integer adminCount;
    /**
     * 推荐行政区名称 	Json数组 	必返回
     */
    private List<PriorityCity> priorityCitys;

    /**
     * 各省包含信息集合 	Json数组 	必返回
     */
    private List<PriorityProvince> allAdmins;

}
