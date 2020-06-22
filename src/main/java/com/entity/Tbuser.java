package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Tbuser)实体类
 *
 * @author makejava
 * @since 2020-06-19 08:00:16
 */
@Data
public class Tbuser implements Serializable {
    private static final long serialVersionUID = -45144906623517333L;
    
    private Integer uid;
    
    private String uname;
    
    private String upwd;


}