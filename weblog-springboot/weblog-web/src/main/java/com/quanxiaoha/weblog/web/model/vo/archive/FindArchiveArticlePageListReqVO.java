package com.quanxiaoha.weblog.web.model.vo.archive;

import com.quanxiaoha.weblog.common.model.BasePageQuery;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}
