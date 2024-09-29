package cn.ghx.tianditu.common.data;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地址对象
 */
@Data
@NoArgsConstructor
public class Address {

    /**
     * 详细地址
     */
    private String formatted_address;
    /**
     * 坐标
     */
    private Location location;

    /**
     * 此点的具体信息（分类）
     */
    private AddressDetail addressComponent;
}
