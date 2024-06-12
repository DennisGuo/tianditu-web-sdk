package cn.ghx.tianditu.administrative;

import cn.ghx.tianditu.administrative.data.AdministrativeResult;
import cn.ghx.tianditu.administrative.params.AdministrativeParams;
import cn.ghx.tianditu.common.BaseService;
import cn.ghx.tianditu.utils.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 行政区划服务V2.0
 * 提供由行政区划地名、行政区划编码查询中心点、轮廓、所属上级行政区划等信息。
 */
public class AdministrativeService extends BaseService {
    public AdministrativeService(String tk) {
        super(tk);
    }


    public AdministrativeResult getAdministrative(AdministrativeParams params) throws IOException {
        List<String> sb = new ArrayList<>();
        String keyword = params.getKeyword();
        if (StringUtils.hasText(keyword)) {
            sb.add("keyword=" + keyword);
        }
        sb.add("childLevel=" + params.getChildLevel());
        sb.add("extensions=" + params.getExtensions());

        String url = "/v2/administrative?" + String.join("&", sb);
        return request(url, AdministrativeResult.class);
    }


}
