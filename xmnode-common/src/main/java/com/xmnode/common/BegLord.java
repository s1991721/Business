package com.xmnode.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xmnode.common.core.domain.AjaxResult;
import com.xmnode.common.core.domain.entity.SysUser;
import com.xmnode.common.utils.http.HttpUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * 管理系统相关调用
 *
 * @author Mr.Lin
 */
@Component
public class BegLord {

    /**
     * 设置请求的统一前缀
     */
    @Value("${lord.url}")
    private String url;

    public AjaxResult getRouters() {
        String res = HttpUtils.sendGet(url + "/open/getRouters", "projectId=1");
        AjaxResult ajaxResult = JSON.parseObject(res, new TypeReference<AjaxResult>() {
        });
        return ajaxResult;
    }

    public SysUser getUserByName(String name) {
        String json = HttpUtils.sendPost(url + "/open/getUserByName", "username=" + name);
        return JSON.parseObject(json, SysUser.class);
    }

    public Set<String> selectMenuPermsByUserId(Long userId) {
        String json = HttpUtils.sendPost(url + "/open/selectMenuPermsByUserId", "userId=" + userId);
        return new HashSet<String>(JSON.parseArray(json,String.class));
    }
}
