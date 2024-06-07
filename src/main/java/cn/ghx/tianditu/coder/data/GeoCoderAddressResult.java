package cn.ghx.tianditu.coder.data;

import cn.ghx.tianditu.common.data.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地理编码接口 返回内容
 */
@NoArgsConstructor
@Data
public class GeoCoderAddressResult {

    /**
     * 返回状态 0：正常返回，101：结果为空，404：出错。
     */
    private String status;

    /**
     * 返回信息 	string 	OK：正常，其他异常。
     */
    private String msg;
    /**
     * 查询版本号
     */
    private String searchVersion;

    /**
     * 地址对象
     */
    private Address result;

}
