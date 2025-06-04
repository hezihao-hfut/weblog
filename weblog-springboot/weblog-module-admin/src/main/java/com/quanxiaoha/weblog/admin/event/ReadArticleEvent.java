package com.quanxiaoha.weblog.admin.event;

import org.springframework.context.ApplicationEvent;
import lombok.Getter;

@Getter
public class ReadArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public ReadArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}

