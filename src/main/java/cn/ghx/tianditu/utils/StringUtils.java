package cn.ghx.tianditu.utils;

import lombok.NoArgsConstructor;

/**
 * 字符串工具
 */
@NoArgsConstructor
public class StringUtils {
    /**
     * 判断是否为空或则null
     * @param str 字符串
     * @return boolean 是否为空或则null
     */
    public static boolean hasText(String str) {
        return (str != null && !str.isBlank());
    }
}
