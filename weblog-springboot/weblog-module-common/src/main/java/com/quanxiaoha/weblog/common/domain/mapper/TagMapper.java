package com.quanxiaoha.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.quanxiaoha.weblog.common.domain.dos.TagDO;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-08-22 17:06
 * @description: 标签
 **/
public interface TagMapper extends BaseMapper<TagDO> {

    /**
     * 标签分页查询
     * @param current
     * @param size
     * @param name
     * @param startDate
     * @param endDate
     * @return
     */
    default Page<TagDO> selectTagPageList(long current, long size, String name, LocalDate startDate, LocalDate endDate) {
        // 分页
        Page<TagDO> page = new Page<>(current, size);
        // 查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Objects.nonNull(name), TagDO::getName, name);
        wrapper.ge(Objects.nonNull(startDate), TagDO::getCreateTime, startDate);  // 大于等于 startDate
        wrapper.le(Objects.nonNull(endDate), TagDO::getCreateTime, endDate);  // 小于等于 endDate
        wrapper.orderByDesc(TagDO::getCreateTime);  // 按创建时间倒序
        return selectPage(page, wrapper);
    }

    /**
     * 标签模糊查询
     * @param key
     * @return
     */
    default List<TagDO> selectByKey(String key) {
        return selectList(new LambdaQueryWrapper<TagDO>().like(TagDO::getName, key).orderByDesc(TagDO::getCreateTime));
    }

    /**
     * 根据标签 ID 批量查询
     * @param tagIds
     * @return
     */
    default List<TagDO> selectByIds(List<Long> tagIds) {
        return selectList(Wrappers.<TagDO>lambdaQuery()
                .in(TagDO::getId, tagIds));
    }
}