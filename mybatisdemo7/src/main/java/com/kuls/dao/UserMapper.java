package com.kuls.dao;

import com.kuls.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/23 12:43 下午
 */
public interface UserMapper {

    User queryUserByID(@Param("id") int id);
}
