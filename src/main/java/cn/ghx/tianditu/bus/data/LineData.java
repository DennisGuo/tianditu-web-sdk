package cn.ghx.tianditu.bus.data;

import lombok.Data;

/**
 * 站点或则线路
 */
@Data
public class LineData {
    /**
     * 唯一ID
     */
    private String uuid;
    /**
     * 名称
     */
    private String name;
}
