package com.msweb.msclubweb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String briefIntroduction;

    /**
     * 
     */
    private String demand;

    /**
     * 
     */
    private String name;

    /**
     *
     */
    private String src;

    @TableField(exist = false)
    private Manager manager;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}