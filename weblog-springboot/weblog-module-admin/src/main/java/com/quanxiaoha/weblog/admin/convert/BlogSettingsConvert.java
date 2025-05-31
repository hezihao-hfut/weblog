package com.quanxiaoha.weblog.admin.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.quanxiaoha.weblog.common.domain.dos.BlogSettingsDO;
import com.quanxiaoha.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.quanxiaoha.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;

@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);

}

