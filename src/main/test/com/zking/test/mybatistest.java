package com.zking.test;

import com.zking.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class mybatistest {
    @Test
    public void temp() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<User> lu = sqlSession.selectList("selectAll");
            System.out.println(lu);
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void temp1() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = sqlSession.selectOne("test.selectquery", 1);
            System.out.println(u);
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void temp2() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = sqlSession.selectOne("test.selectquery2", "a");
            System.out.println(u);
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void temp3() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = sqlSession.selectOne("test.selectquery3", "a");
            System.out.println(u);
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void temp4() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = new User();
            u.setUsername("张三");
            u.setUsersex("ss");
            u.setUserpwd("sss");
            int i = sqlSession.insert("insertuser", u);
            sqlSession.commit();
            System.out.println(i);
            System.out.println(u.getId());
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void inser22() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = new User();
            u.setUsername("张三");
            u.setUsersex("ss");
            u.setUserpwd("sss");
            int i = sqlSession.insert("inser22", u);
            sqlSession.commit();
            System.out.println(i);
            System.out.println(u.getId());
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void temp6() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();
            User u = new User();
            u.setUsername("张");
            u.setUsersex("22");
            u.setUserpwd("sdfsdf");
            u.setId(4);
            int i = sqlSession.insert("updateall",u);
            sqlSession.commit();
            System.out.println(i);

            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void temp7() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();

            int i = sqlSession.insert("deleteid",4);
            sqlSession.commit();
            System.out.println(i);

            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void temp8() {
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession();

          List<User> lu=sqlSession.selectList("query","a");
              int i=sqlSession.selectOne("querys","a");
            System.out.println(lu);

            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
