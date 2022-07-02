package com.campus.wisdom.utilities;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MybatisTools
 * @Description
 * @Author Abel
 * @Date 2022/7/1 15:58
 * @Version 1.0
 **/
public class MybatisTools {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession;
        try {
            //读取MyBatis的核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sqlSession;
    }
}
