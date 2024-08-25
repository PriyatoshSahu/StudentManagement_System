package com.student.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Entity.student;

public interface StdntRepo extends JpaRepository<student, Long>{

}
