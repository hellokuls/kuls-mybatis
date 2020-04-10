package com.kuls.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/23 7:35 上午
 */

@Data
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不同，需要在配置文件中开启驼峰模式
    private int views;
}
