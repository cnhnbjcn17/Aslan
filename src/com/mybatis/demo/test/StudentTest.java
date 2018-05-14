package com.mybatis.demo.test;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.demo.dao.KeyMapper;
import com.mybatis.demo.dao.LockMapper;
import com.mybatis.demo.dao.StudentMapper;
import com.mybatis.demo.entities.Key;
import com.mybatis.demo.entities.Lock;
import com.mybatis.demo.entities.Student;

public class StudentTest {

	SqlSessionFactory sqlSessionFactory = null;
	
	
	@Before
	public void init() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 
	}
	@Test
	public void test() {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper studentDao= session.getMapper(StudentMapper.class);
		Student student = new Student();
		//student.setEmail("lisi@122.com");
		//student.setName("kitty");
		//student.setId(2);
		//studentDao.getStudentById(id)
		//this is a new coment
		
		//fffff
		System.out.println(studentDao.getStudentWhere(student));
		HashMap<String,Object> map = new HashMap<>();
		map.put("ids", Arrays.asList(2,3,4));
		
//		studentDao.addStudent(student);
//		studentDao.deleteStudent(student);
		List<Student> list = studentDao.getForeachWhere(map);
		for (Student student2 : list) {
			System.out.println(student2);
		}
		//Student student = studentDao.getStudentById(1);
//		System.out.println(student);
		session.commit();
		session.close();
	}
	
	@Test
	public void testKey() {
		SqlSession session = sqlSessionFactory.openSession();
		KeyMapper keyDao= session.getMapper(KeyMapper.class);
		//Key key = new Key();
		//key.setId(1);
		Key key2 = keyDao.getKeyByKeyId(1);
		System.out.println(key2);
		session.commit();
		session.close();
	}
	
	@Test
	public void testLock() {
		SqlSession session = sqlSessionFactory.openSession();
		LockMapper dao= session.getMapper(LockMapper.class);
		Lock lock = dao.getLockById(2);
		System.out.println(lock);
		session.commit();
		session.close();
	}
	
	@Test
	public void testInsertTrim() {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper dao= session.getMapper(StudentMapper.class);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "kk");
		map.put("email", "kk@136.com");
		dao.insertTrim(map);
		session.commit();
		session.close();
	}

}
