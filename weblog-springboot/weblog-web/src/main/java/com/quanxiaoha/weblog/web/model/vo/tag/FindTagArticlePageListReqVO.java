package com.quanxiaoha.weblog.web.model.vo.tag;

import com.quanxiaoha.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class FindTagArticlePageListReqVO extends BasePageQuery {

    /**
     * 标签 ID
     */
    @NotNull(message = "标签 ID 不能为空")
    private Long id;

}
