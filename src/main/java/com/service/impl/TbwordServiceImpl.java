package com.service.impl;

import com.dao.TbuserworldDao;
import com.entity.Tbuserworld;
import com.entity.Tbword;
import com.dao.TbwordDao;
import com.service.TbuserworldService;
import com.service.TbwordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Tbword)表服务实现类
 *
 * @author makejava
 * @since 2020-06-20 10:48:04
 */
@Service("tbwordService")
@Transactional
public class TbwordServiceImpl implements TbwordService {
    @Resource
    private TbwordDao tbwordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    @Override
    public Tbword queryById(Integer wid) {
        return this.tbwordDao.queryById(wid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Tbword> queryAllByLimit(int offset, int limit) {
        return this.tbwordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbword 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Tbword tbword) {

        this.tbwordDao.insert(tbword);

        return  this.tbwordDao.insert(tbword);
    }

    /**
     * 修改数据
     *
     * @param tbword 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Tbword tbword) {
        return this.tbwordDao.update(tbword);
    }

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer wid) {
        return this.tbwordDao.deleteById(wid) > 0;
    }

    @Override
    public List<Tbword> queryAll(Tbword tbword) {
        return this.tbwordDao.queryAll(new Tbword());
    }
}