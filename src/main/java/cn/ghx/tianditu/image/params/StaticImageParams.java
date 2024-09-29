package cn.ghx.tianditu.image.params;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取静态图片的参数
 */
@Data
@NoArgsConstructor
public class StaticImageParams {
    /**
     * 图片宽度
     * 默认值：400 	 取值范围：[1, 1024]。
     */
    private Integer width = 512;
    /**
     * 图片宽度
     * 默认值：300 	 取值范围：[1, 1024]。
     */
    private Integer height = 512;
    /**
     * 地图中心点位置，参数为经纬度坐标。
     * 默认值： 116.39127,39.90712
     * 坐标格式：lng <经度>，lat <纬度>，116.39127,39.90712。
     */
    private String center;
    /**
     * 地图级别
     * 默认值：10 ,取值范围[3,18]。
     */
    private Integer zoom = 10;
    /**
     * 标注，为经纬度格式
     * 多个标注之间用竖线隔开，如: lng1,lat1|lng2,lat2|lng3,lat3。
     */
    private String markers;
    /**
     * 设置默认图标样式和自定义图标样式
     * 同一个点的描述参数之间用逗号","隔开，
     * 不同点之间的风格描述用竖线"|"隔开,
     * 风格描述主要有size,label,url[,sLabel,fontColor,fontSize]。
     * <p>
     * 尺寸size：取值为l，m，s，-1；l--大图标 m--中等图标 s--小图标，-1表示自定义图标，
     * 默认图标的标签label：当尺寸取值为l或m时，label为图标的标签，取值为[0-9],[A-Z]，
     * 自定义图标资源url：当且仅当第一个参数为-1时，后面的url自定义图标、sLabel标注、fontColor，
     * 字体颜色为字符串表示的16进制色码比如0xff0000表示红色、fontSize字号大小才起作用，
     * FontSize可选参数[,sLabel,fontColor,fontSize]：当且仅当第一参数为-1，url值不为空时，子标签为自定义图标标签。
     * 注意：对于中文标签要用URI编码格式。
     */
    private String markerStyles;
    /**
     * 折线
     * 可通过经纬度描述；折线之间用竖线"|"分隔；
     * 每条折线的点之间用分号";"分隔;
     * 点坐标用逗号","分隔。坐标格式：lng <经度>，lat <纬度>，例如116.39127,39.90712。
     */
    private String paths;
    /**
     * 折线样式
     * color,weight,opacity[,fillColor]取值范围：
     * 颜色color：16进制表示的数值,如默认值蓝色0xff0000,
     * 线宽weight：[1-40]，默认值6，
     * 透明度opacity：[0-1]，默认值0.6，
     * 填充图颜色fillColor：16进制表示的数值，
     * 此参数为可选参当由此参数时，这些将自动封闭为面，并以此颜色填充面的颜色。
     */
    private String pathStyles;
    /**
     * 静态图叠加层的类型
     * 如："vec_c,cva_c" 或者 "img_c,cva_c" 等
     * 这样的类型组合
     * img_c--影像图
     * vec_c--矢量底图
     * ter_c--地形图，
     * cva_c--中文注记，
     * eva_c--英文注记，
     * cta_c--地形注记。
     */
    private String layers;

    /**
     * 特别说明参数
     * 此参数是为了获得当前给定中心点经纬度、宽度、和高度范围后，
     * 用户自己想在生成的静态图上标注，
     * 本参数就是将指定的经纬度坐标转换成静态图上相对于静态图左上角（0,0）的屏幕坐标，返回的字符串为双竖线隔开的坐标对。
     * 当请求中有此参数时，优先处理此参数。markers,markerStyles,paths,pathStyles参数都不起作用，
     * 参数格式为：lng0,lat0|lng1,lat1|lng2,lat2。
     */
    private String pixLocation;
}
