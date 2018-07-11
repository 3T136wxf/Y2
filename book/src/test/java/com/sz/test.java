package com.sz;

import com.sz.entity.Author;
import com.sz.entity.Book;

import com.sz.mapper.BookMapper;
import com.sz.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class test {

    @Test
    public void m1() {
        // 1 定义mybatis核心配置文件的位置
        String resource = "mybatis.cfg.xml";
        // 2 通过mybatis的工具类加载这个文件为输入流
        InputStream in = null;
        SqlSessionFactory sessionFactory = null;
        SqlSession sqlSession = null;
        try {
            in = Resources.getResourceAsStream(resource);
            // 3 创建一个会话工厂  会话工厂的建造者（一次性用品）
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
            // 4 利用工厂生产会话
            sqlSession = sessionFactory.openSession();
            // 5 使用会话进行相关的操作

            // 得到一个Mapper，mybatis本身通过动态代理帮我们去创建实例
            BookMapper mapper = sqlSession.getMapper(BookMapper.class);

            List<Book> books = mapper.selectById();
            System.out.println(books);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    1 to N 查询
    @Test
    public void select() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Author books = mapper.selectTive(1);
        System.out.println(books);
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    //    N to 1 查询
    @Test
    public void select2() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.selectTive2(3);
        System.out.println(books);
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    //    1 to N
    //    测试二级缓存
    @Test
    public void selectCache() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Author books = mapper.selectTive(1);
        System.out.println(books);
        sqlSession.close();

        SqlSession sqlSession1 = MybatisUtil.getSession();
        BookMapper mapper1 = sqlSession1.getMapper(BookMapper.class);
        mapper1.selectTive(1);
        sqlSession1.close();

    }

    // 1 to n 删除
    @Test
    public void deleteAll() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        try {
            int row = mapper.deleteAll(2);
            System.out.println("影响行数：" + row);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void selectListBook() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Integer> bookList =new ArrayList<>();
        bookList.add(2);
        bookList.add(5);
        List<Book> list1 = mapper.selectList(bookList);
        System.out.println(list1);
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectBook() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.selectById();
        System.out.println(books);
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void insertBook() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book books = new Book();
        try {
            books.setISBN("123-594-757-8");
            books.setName("一万0二夜");
            books.setPrice(20);
            books.setDiscount(6);
            books.setPublisher("深圳福田大学出版");
            mapper.inserTive(books);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void updateBook() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book books = new Book();
        try {
            books.setISBN("123-594-757-10");
//            books.setName("一万0一夜");
//            books.setPrice(5);
//            books.setDiscount(6);
//            books.setPublisher("广州深圳大学出版");
            books.setId(4);
            int row = mapper.updateTive(books);
            System.out.println("影响行数：" + row);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void deleteBook() {
        SqlSession sqlSession = MybatisUtil.getSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        try {
            int row = mapper.deleteTive(5);
            System.out.println("影响行数：" + row);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
