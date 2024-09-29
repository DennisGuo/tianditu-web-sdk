package cn.ghx.tianditu.administrative.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 行政区查询结果
 */
@NoArgsConstructor
@Data
public class AdministrativeResult {

    /**
     * 状态码 200 正常，其他异常请看描述
     */
    private Integer status;
    /**
     * 返回描述
     */
    private String message;
    /**
     * 数据对象
     */
    private DataDTO data;

    /**
     * 数据对象
     */
    @NoArgsConstructor
    @Data
    public static class DataDTO {

        /**
         * 建议搜索词
         * 说明：模糊匹配结果列表，如果只匹配到一条，该字段值为空
         */
        private Object suggestion;
        /**
         * 行政区划信息
         */
        private DistrictDTO district;

        /**
         * 行政区划信息
         */
        @NoArgsConstructor
        @Data
        public static class DistrictDTO {
            /**
             * 行政区划编码
             */
            private String gb;
            /**
             * 行政区划名称
             */
            private String name;
            /**
             * 轮廓数据
             */
            private String boundary;
            /**
             * 中心点坐标
             */
            private CenterDTO center;
            /**
             * 行政区划级别
             */
            private Integer level;

            /**
             * 下级行政区划信息
             */
            private List<DistrictDTO> children;

            /**
             * 坐标
             */
            @NoArgsConstructor
            @Data
            public static class CenterDTO {
                /**
                 * 经度
                 */
                private Double lng;
                /**
                 * 纬度
                 */
                private Double lat;
            }
        }
    }
}
