import com.campus.wisdom.entity.CourseTable;
import com.campus.wisdom.entity.Student;
import com.campus.wisdom.entity.Textbook;
import com.campus.wisdom.mapper.CourseTableMapper;

import com.campus.wisdom.mapper.StudentMapper;
import com.campus.wisdom.mapper.TextbookMapper;
import com.campus.wisdom.service.CourseTableService;
import com.campus.wisdom.service.TextbookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;


/**
 * @ClassName MyTest
 * @Description
 * @Author Abel
 * @Date 2022/7/2 19:24
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MyTest {
    @Autowired
//    private CourseTableMapper courseTableMapper;
    private StudentMapper studentMapper;

    @Test
    public void test() {
//      List<CourseTable> courseTableListBySid = courseTableMapper.getCourseTableListBySid("2020080902012", "1");
        Student student = studentMapper.getStudentBySid("1");
        System.out.println(student);
    }
}
