package com.student.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.student.Entity.student;
import com.student.Service1.StudentService;

@Controller
//@RequestMapping("/student")
public class StudentController {
	


	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data that is given in the add student form
		student student = new student();
		model.addAttribute("student", student);
		return "create_student";	
	}
	
	@PostMapping("/students/crt")
	public String saveStudent(@ModelAttribute("student") student student2 , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			System.out.println("there was a error " + bindingResult);
		}
		
//		model.addAttribute("student2" , student2);
		studentService.saveStudent(student2);
		return "redirect:/students";
	}
	
	@GetMapping("/student/update/{id}")
	public String editStudentForm(@PathVariable Long id , Model model) {
		
		
//		@GetMapping("/student/update/{id}") => this Id parameter which is passed here we need to bind the id to java variable
//		so we (@PathVariable Long id) so we use the @Pathvariable annotation and then add a java variable Long id 
//		 in the long id variable we bind the id to this long type id variable

		//			in simply way =>

		// The @Pathvariable annotation is used to bind the id to java variable in order to do that we gonna use @pathvariable annotation
		
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student4") student student,Model model) {
		
//	Here @ModelAttribute annotation is used bind the form student data mean the data which you are 
//	insert in form that data we need to bind with a java object so we use @modelattribute annotation
//		
//		th:object=student4
		
		
		// get student from database by id
		student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setNmae(student.getNmae());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
//	
//	// handler method to handle delete student request
//	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
//	
	

}
