package com.mybatis.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mybatis.demo.entities.Student;

public interface StudentMapper {
	public Student getStudentById(int id);
	public List<Student> getAll();
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public void addStudent(Student student);
	public List<Student> getStudentWhere(Student student);
	public List<Student> getForeachWhere(Map<String, Object> map);
	public void insertTrim(Map<String, Object> map);
	
}