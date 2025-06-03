package com.quanxiaoha.weblog.web.model.vo.category;

import javax.validation.constraints.NotNull;

import com.quanxiaoha.weblog.common.model.BasePageQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class FindCategoryArticlePageListReqVO extends BasePageQuery {
    /**
     * 分类 ID
     */
	@NotNull(message = "分类 ID 不能为空")
    private Long id;

}

