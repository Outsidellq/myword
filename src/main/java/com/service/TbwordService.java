package com.service;

import com.entity.Tbword;
import java.util.List;

/**
 * (Tbword)表服务接口
 *
 * @author makejava
 * @since 2020-06-20 10:48:03
 */
public interface TbwordService {

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    Tbword queryById(Integer wid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbword> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbword 实例对象
     * @return 实例对象
     */
    int insert(Tbword tbword);

    /**
     * 修改数据
     *
     * @param tbword 实例对象
     * @return 实例对象
     */
    int update(Tbword tbword);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer wid);
    List<Tbword> queryAll(Tbword tbword);
}