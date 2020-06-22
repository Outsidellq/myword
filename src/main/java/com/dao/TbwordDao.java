package com.dao;

import com.entity.Tbword;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Tbword)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-20 10:48:03
 */
public interface TbwordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    Tbword queryById(Integer wid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbword> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbword 实例对象
     * @return 对象列表
     */
    List<Tbword> queryAll(Tbword tbword);

    /**
     * 新增数据
     *
     * @param tbword 实例对象
     * @return 影响行数
     */
    int insert(Tbword tbword);

    /**
     * 修改数据
     *
     * @param tbword 实例对象
     * @return 影响行数
     */
    int update(Tbword tbword);

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 影响行数
     */
    int deleteById(Integer wid);

}