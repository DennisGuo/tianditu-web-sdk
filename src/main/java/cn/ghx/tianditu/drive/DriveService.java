package cn.ghx.tianditu.drive;

import cn.ghx.tianditu.common.BaseService;
import cn.ghx.tianditu.drive.data.DriveResult;
import cn.ghx.tianditu.drive.params.DriveParams;

import java.io.IOException;

/**
 * 驾车规划
 * 根据输入起点、终点和途经点规划查询驾车路线。
 */
public class DriveService extends BaseService {
    /**
     * 构造函数
     * @param tk 天地图密钥
     */
    public DriveService(String tk) {
        super(tk);
    }

    /**
     * 根据输入起点、终点和途经点规划查询驾车路线。
     *
     * @param params DriveParams
     * @return DriveResult
     * @throws IOException 异常
     */
    public DriveResult getDriveRoutes(DriveParams params) throws IOException {
        String url = "/drive?type=search&postStr=" + gson.toJson(params);
        return request(url, DriveResult.class);
    }
}
