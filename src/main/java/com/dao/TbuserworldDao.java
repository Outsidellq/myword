package com.dao;

import com.entity.Tbuserworld;
import com.entity.Tbword;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Tbuserworld)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-19 09:44:28
 */
public interface TbuserworldDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tuid 主键
     * @return 实例对象
     */
    Tbuserworld queryById(Integer tuid);

    List<Tbword> selWordByUid(Integer tuid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbuserworld> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbuserworld 实例对象
     * @return 对象列表
     */
    List<Tbuserworld> queryAll(Tbuserworld tbuserworld);

    /**
     * 新增数据
     *
     * @param tbuserworld 实例对象
     * @return 影响行数
     */
    int insert(Tbuserworld tbuserworld);

    /**
     * 修改数据
     *
     * @param tbuserworld 实例对象
     * @return 影响行数
     */
    int update(Tbuserworld tbuserworld);

    /**
     * 通过主键删除数据
     *
     * @param tuid 主键
     * @return 影响行数
     */
    int deleteById(Object tuid);

}