package com.controller;
import com.service.TbuserworldService;
import com.utl.Result;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * (Tbuserworld)表控制层
 *
 * @author makejava
 * @since 2020-06-19 09:44:28
 */
@RestController
@RequestMapping("tbuserworld")
public class TbuserworldController {
    /**
     * 服务对象
     */
    @Resource
    private TbuserworldService tbuserworldService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping(value = "selectAll",produces = "application/json;charset=utf-8")
    public Result selectOne(Integer id) {
        return Result.success(this.tbuserworldService.selWordByUid(id));
    }
    @RequestMapping(value = "delete")
    public int delete(Integer id){
        return this.tbuserworldService.deleteById(id);
    }

}