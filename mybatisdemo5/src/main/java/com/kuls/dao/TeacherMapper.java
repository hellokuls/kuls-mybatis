package com.kuls.dao;

import com.kuls.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/21 7:46 下午
 */
public interface TeacherMapper {


    List<Teacher> getTeacher();


    Teacher getTeacherByID(@Param("tid") int id);
    Teacher getTeacherByID2(@Param("tid") int id);
}
