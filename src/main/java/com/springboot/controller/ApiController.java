package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.APIService;

@RestController
@RequestMapping("/student")
public class ApiController {

	@Autowired
	private APIService aPIService;

	@GetMapping
	public ResponseEntity<Student> fetchStudent(@RequestParam(name = "studentId") String studentId,
			@RequestParam(name = "isCacheable") boolean isCacheable) throws InterruptedException {
		return new ResponseEntity<>(aPIService.fetchStudent(studentId, isCacheable).get(), HttpStatus.OK);
	}
}