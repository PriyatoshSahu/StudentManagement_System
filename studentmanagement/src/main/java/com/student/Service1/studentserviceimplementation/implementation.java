package com.student.Service1.studentserviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Entity.student;
import com.student.Service1.StudentService;
import com.student.StudentRepository.StdntRepo;
@Service
public class implementation implements StudentService{

	
@Autowired
private StdntRepo studentRepository;
	
//	public implementation(StdntRepo studentRepository) {
//		super();
//		this.studentRepository = studentRepository;
//	}

	@Override
	public List<student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public student saveStudent(student student) {
		return studentRepository.save(student);
	}

	@Override
	public student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public student updateStudent(student student) {
		return studentRepository.save(student);
	}

//	@Override
//	public void deleteStudentbyid(long id) {
//		
//	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public student findByName(String name) {
		return null ;	}
	

}
