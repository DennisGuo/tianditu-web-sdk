package cn.ghx.tianditu.bus.data;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 站点或则线路
 */
@Data
@NoArgsConstructor
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
