import com.kuls.dao.TeacherMapper;
import com.kuls.pojo.Teacher;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/22 1:24 下午
 */
public class TeacherTest {

    @Test
    public void getTeacherByID(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherByID(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getTeacherByID2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacherByID2(1);
        System.out.println(teacher);

        sqlSession.close();
    }



}
