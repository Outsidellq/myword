package com.service.impl;

import com.entity.Tbuserworld;
import com.dao.TbuserworldDao;
import com.entity.Tbword;
import com.service.TbuserworldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Tbuserworld)表服务实现类
 *
 * @author makejava
 * @since 2020-06-19 09:44:28
 */
@Service("tbuserworldService")
public class TbuserworldServiceImpl implements TbuserworldService {
    @Resource
    private TbuserworldDao tbuserworldDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tuid 主键
     * @return 实例对象
     */
    @Override
    public Tbuserworld queryById(Integer tuid) {
        return this.tbuserworldDao.queryById(tuid);
    }

    @Override
    public List<Tbword> selWordByUid(Integer tuid) {
        return this.tbuserworldDao.selWordByUid(tuid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Tbuserworld> queryAllByLimit(int offset, int limit) {
        return this.tbuserworldDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbuserworld 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Tbuserworld tbuserworld) {
        return this.tbuserworldDao.insert(tbuserworld);
    }

    /**
     * 修改数据
     *
     * @param tbuserworld 实例对象
     * @return 实例对象
     */
    @Override
    public Tbuserworld update(Tbuserworld tbuserworld) {
        this.tbuserworldDao.update(tbuserworld);
        return this.queryById(tbuserworld.getTuid());
    }


    @Override
    public int deleteById(Integer id) {
        return this.tbuserworldDao.deleteById(id);
    }
}