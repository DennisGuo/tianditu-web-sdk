package cn.ghx.tianditu.image;

import cn.ghx.tianditu.common.BaseService;
import cn.ghx.tianditu.image.params.StaticImageParams;
import cn.ghx.tianditu.utils.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 静态地图API
 * 实现将天地图地图以图片形式嵌入到您的网页中
 */
public class StaticImageService extends BaseService {
    public StaticImageService(String tk) {
        super(tk);
    }

    public byte[] getImage(StaticImageParams params) throws IOException {

        List<String> list = new ArrayList<>();

        list.add("width=" + (params.getWidth() != null ? params.getWidth() : 512));
        list.add("height=" + (params.getHeight() != null ? params.getHeight() : 512));
        list.add("zoom=" + (params.getZoom() != null ? params.getZoom() : 10));
        if (StringUtils.hasText(params.getCenter())) {
            list.add("center=" + params.getCenter());
        }
        if (StringUtils.hasText(params.getMarkers())) {
            list.add("markers=" + params.getMarkers());
        }
        if (StringUtils.hasText(params.getMarkerStyles())) {
            list.add("markerStyles=" + params.getMarkerStyles());
        }
        if (StringUtils.hasText(params.getPaths())) {
            list.add("paths=" + params.getPaths());
        }
        if (StringUtils.hasText(params.getPathStyles())) {
            list.add("pathStyle=" + params.getPathStyles());
        }
        if (StringUtils.hasText(params.getLayers())) {
            list.add("layers=" + params.getLayers());
        }
        if (StringUtils.hasText(params.getPixLocation())) {
            list.add("pixLocation=" + params.getPixLocation());
        }

        String url = "/staticimage?" + String.join("&", list);

        return requestBytes(url);
    }
}
