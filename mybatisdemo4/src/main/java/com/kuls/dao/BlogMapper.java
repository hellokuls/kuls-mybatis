package com.kuls.dao;

import com.kuls.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/23 7:40 上午
 */
public interface BlogMapper {

    int addBlog(Map map);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogWhere(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}
