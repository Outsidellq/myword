package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Tbword)实体类
 *
 * @author makejava
 * @since 2020-06-20 10:48:02
 */
@Data
public class Tbword implements Serializable {
    private static final long serialVersionUID = -86971606965777240L;
    
    private Integer wid;
    
    private String word;
    
    private String pronounce;
    
    private String des;




}