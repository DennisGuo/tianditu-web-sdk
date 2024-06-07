package cn.ghx.tianditu.common.data;

import lombok.Data;

@Data
public class Status {
    /**
     * 信息码 	Int 	必返回 	服务状态码表
     */
    private Integer infocode;
    /**
     * 返回中文描述 	String 	必返回 	服务状态码表
     */
    private String cndesc;
}
