package com.kuls.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/17 11:49 上午
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {

        try {
            //固定代码，使用mybatis获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



//    既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
//    org.apache.ibatis.session.SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。

    public static SqlSession getSqlSession(){

        //获取SqlSession对象
        return sqlSessionFactory.openSession(true);
    }


}
