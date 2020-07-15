package com.kuls.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/21 7:44 下午
 */

@Data
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
