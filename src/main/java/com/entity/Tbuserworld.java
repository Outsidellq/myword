package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Tbuserworld)实体类
 *
 * @author makejava
 * @since 2020-06-19 09:44:28
 */
@Data
public class Tbuserworld implements Serializable {
    private static final long serialVersionUID = 444218336409734531L;
    
    private Integer tuid;
    
    private Integer twid;
    private List<Tbword> listword;




}