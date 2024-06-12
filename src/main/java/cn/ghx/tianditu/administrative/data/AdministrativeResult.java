package cn.ghx.tianditu.administrative.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AdministrativeResult {

    private Integer status;
    private String message;
    private DataDTO data;

    @NoArgsConstructor
    @Data
    public static class DataDTO {

        private Object suggestion;
        private DistrictDTO district;

        @NoArgsConstructor
        @Data
        public static class DistrictDTO {
            private String gb;
            private String name;
            private String boundary;
            private CenterDTO center;
            private Integer level;

            @NoArgsConstructor
            @Data
            public static class CenterDTO {
                private Double lng;
                private Double lat;
            }
        }
    }
}
