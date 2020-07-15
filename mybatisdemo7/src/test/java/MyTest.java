import com.kuls.dao.UserMapper;
import com.kuls.pojo.User;
import com.kuls.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/23 12:46 下午
 */
public class MyTest {
    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserByID(3);
        System.out.println(user);
        System.out.println("==============");

        //手动清除缓存
       // sqlSession.clearCache();
        User user1 = mapper.queryUserByID(3);
        System.out.println(user1);

        //缓存
        System.out.println(user == user1);


        sqlSession.close();

    }

    @Test
    public void Test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserByID(3);
        System.out.println(user);
        System.out.println("==============");
        sqlSession.close();

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserByID(4);
        System.out.println(user2);
        System.out.println("==============");
        sqlSession2.close();


        System.out.println(user == user2);

    }
}
