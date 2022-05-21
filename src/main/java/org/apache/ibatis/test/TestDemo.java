package org.apache.ibatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @className: TestDemo
 * @description:
 * @author: mufansen
 * @date: 2022/5/7
 **/
public class TestDemo {

  public static void main(String[] args) {
    InputStream inputStream = null;
    try {

      inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    } catch (IOException e) {
      e.printStackTrace();
    }
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User byId = mapper.getById(1);
    System.out.println("byId"+byId);
  }
}
