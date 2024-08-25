package com.student.Service1;

import java.util.List;

import com.student.Entity.student;

public interface StudentService {
	
//	public List<student> getallStudents();
//
//	public student savestudent(student student1);
	
	
    List<student> getAllStudents();
	
	student saveStudent(student student1);

	student getStudentById(Long id);
	
	student updateStudent(student student);
	
	void deleteStudentById(Long id);
	
	student findByName(String name);
	
	
}
