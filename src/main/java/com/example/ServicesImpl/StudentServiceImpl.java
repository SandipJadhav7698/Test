package com.example.ServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepository;
import com.example.dto.Studentdto;
import com.example.model.Student;
import com.example.services.StudentServices;
@Service
public class StudentServiceImpl implements StudentServices{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public ResponseEntity<String> save(Studentdto studentdto) {
		Student student=new Student();
		student.setStudentName(studentdto.getStudentName());
		student.setEmail(studentdto.getEmail());
		studentRepository.save(student);
		return new ResponseEntity<>("Saved SucessFully....",HttpStatus.OK);
	}

	@Override
	public List<Student> alldata() {
		List<Student> student= studentRepository.findAll();
		return student;
	}

}
