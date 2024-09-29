package cn.ghx.tianditu.common;

/**
 * 天地图返回异常
 */
public class TiandituException extends RuntimeException {

    /**
     * 构造天地图返回异常
     * @param message 异常消息，通常是json
     */
    public TiandituException(String message) {
        super(message);
    }
}
