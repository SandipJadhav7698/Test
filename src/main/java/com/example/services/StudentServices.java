package com.example.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.dto.Studentdto;
import com.example.model.Student;

public interface StudentServices {

	ResponseEntity<String> save(Studentdto studentdto);

	List<Student> alldata();

}
