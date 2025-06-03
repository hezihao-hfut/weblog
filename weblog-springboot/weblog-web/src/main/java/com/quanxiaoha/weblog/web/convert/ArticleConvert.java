package com.quanxiaoha.weblog.web.convert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.quanxiaoha.weblog.common.domain.dos.ArticleDO;
import com.quanxiaoha.weblog.web.model.vo.article.FindIndexArticlePageListRspVO;

@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    @Mapping(target = "category", ignore = true)
    @Mapping(target = "tags", ignore = true)
    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

}

