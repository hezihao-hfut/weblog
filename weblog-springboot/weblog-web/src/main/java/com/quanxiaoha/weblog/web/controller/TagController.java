package com.quanxiaoha.weblog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quanxiaoha.weblog.common.utils.Response;
import com.quanxiaoha.weblog.web.service.TagService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.quanxiaoha.weblog.common.aspect.ApiOperationLog;

@RestController
@RequestMapping("/tag")
@Api(tags = "标签")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/list")
    @ApiOperation(value = "前台获取标签列表")
    @ApiOperationLog(description = "前台获取标签列表")
    public Response findTagList() {
        return tagService.findTagList();
    }

}
