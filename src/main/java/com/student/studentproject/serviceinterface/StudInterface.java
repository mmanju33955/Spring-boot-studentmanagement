package com.student.studentproject.serviceinterface;

import java.util.List;

import com.student.studentproject.model.studentmodel;

public interface StudInterface {
	public  studentmodel getStudentByNameandPassword(String name, String password) ;
		List<studentmodel> getAll();
		String deleteById(int id);
		String getUpdateId(int id);
		studentmodel getstudentId(int id);
		String postallDetails(studentmodel dto);
	

}
