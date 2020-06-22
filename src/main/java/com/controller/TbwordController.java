package com.controller;
import com.dao.TbuserworldDao;
import com.entity.Tbuserworld;
import com.entity.Tbword;
import com.service.TbuserworldService;
import com.service.TbwordService;
import com.utl.Result;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
/**
 * (Tbword)表控制层
 *
 * @author makejava
 * @since 2020-06-20 10:44:20
 */
@RestController
@RequestMapping("tbword")
public class TbwordController {
    /**
     * 服务对象
     */
    @Resource
    private TbwordService tbwordService;
    @Resource
    private TbuserworldService tbuserworldService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("selectOne")
    public Result selectOne(Integer id) {
        return Result.success(this.tbwordService.queryById(id));
    }

    @RequestMapping(value = "insertWord" )
    public int insertWord(Tbword tbword,Integer uid) {
        System.out.println("tbword+"+tbword.getPronounce());
        this.tbwordService.insert(tbword);
        Tbuserworld tbuserworld=new Tbuserworld();
        tbuserworld.setTuid(uid);
        tbuserworld.setTwid(tbword.getWid());
        System.out.println(tbuserworld.getTuid()+tbuserworld.getTwid());
        return this.tbuserworldService.insert(tbuserworld);
    }
@RequestMapping("update")
    public int update(Tbword tbword){
        return this.tbwordService.update(tbword);
    }

}