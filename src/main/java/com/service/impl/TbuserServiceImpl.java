package com.service.impl;

import com.entity.Tbuser;
import com.dao.TbuserDao;
import com.service.TbuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Tbuser)表服务实现类
 *
 * @author makejava
 * @since 2020-06-19 08:00:16
 */
@Service("tbuserService")
public class TbuserServiceImpl implements TbuserService {
    @Resource
    private TbuserDao tbuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Tbuser queryById(Integer uid) {
        return this.tbuserDao.queryById(uid);
    }

    @Override
    public Tbuser queryByNamePwd(Tbuser tbuser) {
        return this.tbuserDao.queryByNamePwd(tbuser);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Tbuser> queryAllByLimit(int offset, int limit) {
        return this.tbuserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbuser 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Tbuser tbuser) {

        return  this.tbuserDao.insert(tbuser);
    }

    /**
     * 修改数据
     *
     * @param tbuser 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Tbuser tbuser) {
        return this.tbuserDao.update(tbuser);
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.tbuserDao.deleteById(uid) > 0;
    }


}