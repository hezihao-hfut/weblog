package com.quanxiaoha.weblog.common.config;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface InsertBatchMapper<T> extends BaseMapper<T> {

    // 批量插入
    int insertBatchSomeColumn(@Param("list") List<T> batchList);

}
