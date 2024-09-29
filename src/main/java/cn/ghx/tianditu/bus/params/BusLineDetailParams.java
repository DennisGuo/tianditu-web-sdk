package cn.ghx.tianditu.bus.params;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询公交站点换成参数
 */
@Data
@NoArgsConstructor
public class BusLineDetailParams {
    /**
     * docid
     * 根据提供的docid 搜索内容，
     * 主要是根据前端给的id 搜索公交站和公交线的详细信息
     */
    private String uuid;
    /**
     * 线路ID
     */
    private String lineUuid;
    /**
     * 站点ID
     */
    private String stationUuid;
}
