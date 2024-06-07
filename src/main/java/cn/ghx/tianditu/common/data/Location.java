package cn.ghx.tianditu.common.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Location {

    /**
     * 匹配分
     */
    private Integer score;
    /**
     * 关键字
     */
    private String keyWord;

    /**
     * 坐标点显示经度
     */
    private Double lon;
    /**
     * 类别名称
     */
    private String level;
    /**
     * 坐标点显示纬度
     */
    private Double lat;
}
