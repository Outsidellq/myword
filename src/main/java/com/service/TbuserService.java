package com.service;

import com.entity.Tbuser;
import java.util.List;

/**
 * (Tbuser)表服务接口
 *
 * @author makejava
 * @since 2020-06-19 08:00:16
 */
public interface TbuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Tbuser queryById(Integer uid);

    Tbuser queryByNamePwd(Tbuser tbuser);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tbuser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbuser 实例对象
     * @return 实例对象
     */
    int insert(Tbuser tbuser);

    /**
     * 修改数据
     *
     * @param tbuser 实例对象
     * @return 实例对象
     */
    int update(Tbuser tbuser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}