package com.quanxiaoha.weblog.admin.model.vo.article;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteArticleReqVO {

    @NotNull(message = "文章 ID 不能为空")
    private Long id;
}

