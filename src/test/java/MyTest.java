import com.campus.wisdom.entity.CourseTable;
import com.campus.wisdom.entity.Exam;
import com.campus.wisdom.entity.Textbook;
import com.campus.wisdom.mapper.CourseTableMapper;

import com.campus.wisdom.mapper.ExamMapper;
import com.campus.wisdom.mapper.TextbookMapper;
import com.campus.wisdom.service.CourseTableService;
import com.campus.wisdom.service.TextbookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description
 * @Author Abel
 * @Date 2022/7/2 19:24
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MyTest {
    @Autowired
    private CourseTableMapper courseTableMapper;
    @Autowired
    private TextbookMapper textbookMapper;

    @Autowired
    private CourseTableService courseTableService;
    @Autowired
    private TextbookService textbookService;

    @Autowired
    private ExamMapper examMapper;

    @Test
    public void testMapper() {
        Textbook t = textbookMapper.getTextbookById("9787302408642");
        List<CourseTable> a = courseTableMapper.getCourseTableListBySid("2020080902012", "1");
        List<String> cid = courseTableMapper.getCidListBySid("2020080902012", "1");
        List<Exam> examList = examMapper.getExamListByCid(cid);
        System.out.println(examList);
        System.out.println(cid);
        System.out.println(a);
        System.out.println(t);
    }

    @Test
    public void testService(){
        Textbook t = textbookService.getTextbookById("9787302408642");
        List<CourseTable> c = courseTableService.getCourseTableListBySid("2020080902012", "1");
        System.out.println(c);
        System.out.println(t);
    }
}
