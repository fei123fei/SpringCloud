package com.springboot.cloud.gen.model.config;


import lombok.Data;

/**
 * @author: dongwei
 * @date: 2018/11/8 14:04
 */
@Data
public class ColumnInfoConfig {

    /**
     * 列名
     */
    private String columnName;

    /**
     * 字段类型
     */
    private String dataType;

    /**
     * 字段注释
     */
    private String columnComment;

    /**
     * 属性类型
     */
    private String attrType;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 首字符大写的属性名
     */
    private String upAttrName;
}
