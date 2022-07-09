import com.campus.wisdom.entity.*;
import com.campus.wisdom.mapper.*;

import com.campus.wisdom.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

/*
 *                        _oo0oo_
 *                       o8888888o
 *                       88" . "88
 *                       (| -_- |)
 *                       0\  =  /0
 *                     ___/`---'\___
 *                   .' \\|     |// '.
 *                  / \\|||  :  |||// \
 *                 / _||||| -:- |||||- \
 *                |   | \\\  - /// |   |
 *                | \_|  ''\---/''  |_/ |
 *                \  .-\__  '-'  ___/-. /
 *              ___'. .'  /--.--\  `. .'___
 *           ."" '<  `.___\_<|>_/___.' >' "".
 *          | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *          \  \ `_.   \_ __\ /__ _/   .-` /  /
 *      =====`-.____`.___ \_____/___.-`___.-'=====
 *                        `=---='
 *
 *
 *      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *            佛祖保佑       永无BUG
 */
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

    @Autowired
    private GdesignMapper gdesignMapper;

    @Autowired
    private StudyMapper studyMapper;

    @Autowired
    private StudyService studyService;

    @Autowired
    private ExamService examService;

    @Autowired
    private MyGradeMapper myGradeMapper;

    @Autowired
    private MyGradeService myGradeService;

    @Test
    public void testMapper() {
//        Textbook t = textbookMapper.getTextbookById("9787302408642");
        List<CourseTable> a = courseTableMapper.getCourseTableListBySid("2020080902001", "1");
//        List<String> cid = courseTableMapper.getCidListBySid("2020080902012", "1");
//        List<Exam> examList = examMapper.getExamListByCid(cid);
//        System.out.println(examList);
//        System.out.println(cid);
        System.out.println(a);
//        System.out.println(t);
//        Gdesign gdesign = gdesignMapper.getGdesignBySid("2020080902012");
//        System.out.println(gdesign);
//        List<Study> studyList = studyMapper.getStudyListBySid("2020080902001");
//        System.out.println(studyList);
//        List<MyGrade> list = myGradeMapper.getMyGradeListBySid("2020080902001");
//        System.out.println(list);
    }

    @Test
    public void testService(){
//        Textbook t = textbookService.getTextbookById("9787302408642");
        List<CourseTable> c = courseTableService.getCourseTableListBySid("2020080902001", "1");
        System.out.println(c);
//        System.out.println(t);
//        List<Study> studyList = studyService.getStudyListBySid("2020080902001");
//        System.out.println(studyList);
//        List<String> list = courseTableMapper.getSemesterList("2020080902001");
//        System.out.println(list);
//        List<Exam> examList = examService.getExamListBySid("2020080902001");
//        Collections.sort(examList);
////        System.out.println(examList);
//        List<MyGrade> list = myGradeService.getMyGradeListBySid("2020080902001");
//        Collections.sort(list);
//        System.out.println(list);
    }
}