package com.controller;
import com.entity.Tbuser;
import com.service.TbuserService;
import com.utl.Result;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
/**
 * (Tbuser)表控制层
 *
 * @author makejava
 * @since 2020-06-19 08:00:16
 */
@RestController
@RequestMapping("tbuser")
public class TbuserController {
    /**
     * 服务对象
     */
    @Resource
    private TbuserService tbuserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Tbuser selectOne(Integer id) {
        return this.tbuserService.queryById(id);
    }
    @RequestMapping(value = "selectByName")
    public Result selectByName(Tbuser tbuser){
    if(this.tbuserService.queryByNamePwd(tbuser)==null) {
        return Result.success();
    }else {
        return Result.fail();
    }
    }
    @RequestMapping("update")
    public int updatePwd(Tbuser tbuser){
        return this.tbuserService.update(tbuser);
    }


    @RequestMapping("login")
    public Result login(Tbuser tbuser) {
        if(this.tbuserService.queryByNamePwd(tbuser)==null) {
            return Result.fail(this.tbuserService.queryByNamePwd(tbuser),"操作失败");
        }else {
            return Result.success(this.tbuserService.queryByNamePwd(tbuser));
        }
    }

    @RequestMapping("addUser")
    public int insertUser(Tbuser tbuser){
        return this.tbuserService.insert(tbuser);
    }

}