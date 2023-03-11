package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Studentdto;
import com.example.model.Student;
import com.example.services.StudentServices;

@RestController
public class StudentController {
	@Autowired
	StudentServices services;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Studentdto studentdto){
		return services.save(studentdto);
	}
@GetMapping("/AllData")
public List<Student> Alldata(){
	return services.alldata();
}
}
