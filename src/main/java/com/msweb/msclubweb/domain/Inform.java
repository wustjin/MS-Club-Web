package com.msweb.msclubweb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName inform
 */
@TableName(value ="inform")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inform implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String introduction;

    /**
     * 
     */
    private String outline;

    /**
     * 
     */
    private Date time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}