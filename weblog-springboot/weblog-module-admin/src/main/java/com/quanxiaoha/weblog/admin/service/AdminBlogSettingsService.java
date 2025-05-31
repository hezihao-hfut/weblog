package com.quanxiaoha.weblog.admin.service;

import com.quanxiaoha.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.quanxiaoha.weblog.common.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客基础信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客基础信息
     * @return
     */
    Response findDetail();
}
