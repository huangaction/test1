package com.newer.test;

import com.newer.dao.UserDao;
import com.newer.pojo.Student;

import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author shining
 */
public class UserTest {
    @Test
    public void test(){
        //获取与数据库的连接，通过工具类方法获取
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        //由mybatis通过加载映射文件代理出UserDao接口的实现类
        UserDao dao=sqlSession.getMapper(UserDao.class);

        Student student=dao.findById(5);
        System.out.println(student.getUserName());

        student.setSex("男");
        student.setPassWord("abcabc");

        System.out.println(dao.updateUser(student));

        //所有增删改方法必须提交
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);

    }
}
