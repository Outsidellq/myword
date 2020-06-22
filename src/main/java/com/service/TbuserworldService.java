package com.service;

import com.entity.Tbuserworld;
import com.entity.Tbword;

import java.util.List;

/**
 * (Tbuserworld)表服务接口
 *
 * @author makejava
 * @since 2020-06-19 09:44:28
 */
public interface TbuserworldService {

    /**
     * 通过ID查询单条数据
     *
     * @param tuid 主键
     * @return 实例对象
     */
    Tbuserworld queryById(Integer tuid);
    List<Tbword> selWordByUid(Integer tuid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbuserworld> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbuserworld 实例对象
     * @return 实例对象
     */
    int insert(Tbuserworld tbuserworld);

    /**
     * 修改数据
     *
     * @param tbuserworld 实例对象
     * @return 实例对象
     */
    Tbuserworld update(Tbuserworld tbuserworld);

    /**
     * 通过主键删除数据
     *
     * @param tuid 主键
     * @return 是否成功
     */
    int deleteById(Integer tuid);

}