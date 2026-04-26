package com.student.studentproject.controll;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentproject.model.studentmodel;
import com.student.studentproject.service.studentservice;

import ch.qos.logback.classic.Logger;

import org.slf4j.LoggerFactory;

@RestController
public class Controller {
	

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/test")
    public String test() {
        logger.info("Test API is called");
        return "Hello, Logger Working!";

    }
	@Autowired
	studentservice service;
	@PostMapping("/create")
	public String PostallDetails(@RequestBody studentmodel dto) {
		return service. PostallDetails(dto);
	}
	@GetMapping("/get/{id}")
	public studentmodel getStudentId(@PathVariable int id) { 
		return service.getStudentId(id);
	}
	@PutMapping("/update/{id}")
	public String getUpdateId(@PathVariable int id) {
		return service.getUpdateId(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	@GetMapping("/getall")
	public  List<studentmodel> getAll(){
		logger.info("Test API is called");//for logger only
		return service.getAll();
	}
	@GetMapping("/getNameandPassword")
	 public List<studentmodel>  getNameAndPassword(@RequestParam String name,@RequestParam String password) {
		return service. getNameAndPassword(name, password);
	}
}
