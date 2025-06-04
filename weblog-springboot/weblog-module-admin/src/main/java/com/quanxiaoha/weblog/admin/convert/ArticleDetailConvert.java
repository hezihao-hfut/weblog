package com.quanxiaoha.weblog.admin.convert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.quanxiaoha.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.quanxiaoha.weblog.common.domain.dos.ArticleDO;

@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    @Mapping(target = "categoryId", ignore = true)
    @Mapping(target = "content", ignore = true)
    @Mapping(target = "tagIds", ignore = true)
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}

