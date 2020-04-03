package com.kuls.dao;

import com.kuls.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/17 12:00 下午
 */
public interface UserMapper {
   //查询全部用户
   List<User> getUserList();

   //模糊查询
   List<User> getUserLike(String value);

   //根据id获取用户
   User getIdUser(int id);

   //插入一个用户
   int insertUser(User user);

   //根据map来插入用户
   int insertUser1(HashMap<String, Object> map);

   //更新用户数据
   int upDataUser(User user);

   //根据id删除一个用户
   int deleteUser(int id);

   //分页
   List<User> getUserByLimit(Map<String,Object> map);
}
