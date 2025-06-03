package com.quanxiaoha.weblog.web.convert;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.quanxiaoha.weblog.common.domain.dos.ArticleDO;
import com.quanxiaoha.weblog.web.model.vo.archive.FindArchiveArticleRspVO;
import com.quanxiaoha.weblog.web.model.vo.article.FindIndexArticlePageListRspVO;
import com.quanxiaoha.weblog.web.model.vo.category.FindCategoryArticlePageListRspVO;
import com.quanxiaoha.weblog.web.model.vo.tag.FindTagArticlePageListRspVO;

@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    @Mapping(target = "category", ignore = true)
    @Mapping(target = "tags", ignore = true)
    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

    /**
     * 将 DO 转化为归档文章 VO
     * @param bean
     * @return
     */
    @Mapping(target = "createDate", expression = "java(java.time.LocalDate.from(bean.getCreateTime()))")
    @Mapping(target = "createMonth", expression = "java(java.time.YearMonth.from(bean.getCreateTime()))")
    FindArchiveArticleRspVO convertDO2ArchiveArticleVO(ArticleDO bean);
    
    /**
     * 将 DO 转换成分类文章 VO
     * @param bean
     * @return
     */
    @Mapping(target = "createDate", expression = "java(java.time.LocalDate.from(bean.getCreateTime()))")
    FindCategoryArticlePageListRspVO convertDO2CategoryArticleVO(ArticleDO bean);
    
    /**
     * 将 DO 转换为标签文章 VO
     * @param bean
     * @return
     */
    @Mapping(target = "createDate", expression = "java(java.time.LocalDate.from(bean.getCreateTime()))")
    FindTagArticlePageListRspVO convertDO2TagArticleVO(ArticleDO bean);
}