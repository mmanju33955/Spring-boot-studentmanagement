package com.student.studentproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentproject.entity.StudentEntity;
import com.student.studentproject.exception.InvalidNameExcetion;
import com.student.studentproject.model.studentmodel;
import com.student.studentproject.repository.Studentrepository;
import com.student.studentproject.serviceinterface.StudInterface;
@Service
public class studentservice {
	@Autowired
	Studentrepository repo;
	
	public String PostallDetails(studentmodel dto) {
		StudentEntity  entity=new StudentEntity();
		if(entity.getName()!=null) {
			if(!Character.isUpperCase(entity.getName().charAt(0))) {
				throw new InvalidNameExcetion ("Name must be start with capital letter");
			}
		}
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setRole(dto.getRole());
		entity.setPhonenumber(dto.getPhonenumber());
		repo.save(entity);
		return "created Sucessfully";
		
	}
	public studentmodel getStudentId(int id) {
		Optional<StudentEntity> entity=repo.findById(id);
		if(entity.isPresent()) {
			studentmodel dto=new studentmodel();
			dto.setId(entity.get().getId());
			dto.setName(entity.get().getName());
			dto.setEmail(entity.get().getEmail());
			dto.setPassword(entity.get().getPassword());
			dto.setRole(entity.get().getRole());
			dto.setPhonenumber(entity.get().getPhonenumber());
			return dto;
			
		}
		return null;
		
	}
	public String getUpdateId(int id) {
		Optional<StudentEntity> entity=repo.findById(id);
		studentmodel dto=new studentmodel();
		if(entity.isPresent()) {
			if(dto.getName()!=null) {
				entity.get().setName(dto.getName());
			}
			if(dto.getId()!=null) {
				entity.get().setId(dto.getId());
			}
			if(dto.getEmail()!=null) {
				entity.get().setEmail(dto.getEmail());
			}
			if(dto.getPassword()!=null) {
				entity.get().setPassword(dto.getPassword());
			}
			if(dto.getPhonenumber()!=null) {
				entity.get().setPhonenumber(dto.getPhonenumber());
			}
			if(dto.getRole()!=null) {
				entity.get().setRole(dto.getRole());
			}
			return "updated successfully";
		}
		return "given id is not found";
		
	}
	public String deleteById(int id) {
		Optional<StudentEntity> entity=repo.findById(id);
		if(entity.isPresent()) {
			repo.deleteById(id);
			return "sucessfully deleted";
		}
		return " Id not found!";
		
	}
	
	public  List<studentmodel> getAll(){
		List<StudentEntity> entity=repo.findAll();
		List<studentmodel> dto=new ArrayList<>();
		for(StudentEntity ent:entity) {
			studentmodel dto1=new studentmodel();
			dto1.setId(ent.getId());
			dto1.setName(ent.getName());
			dto1.setEmail(ent.getEmail());
			dto1.setPassword(ent.getPassword());
			dto1.setPhonenumber(ent.getPhonenumber());
			dto1.setRole(ent.getRole());
			 dto.add(dto1);
		}
		return dto;
		
	}
//    public List<studentmodel> getStudentByNameandPassword(String name, String password) {
//    	List<StudentEntity> entity = repo.findAll();
//        List<studentmodel> dto = new ArrayList<>();
//
//        for (StudentEntity ent : entity) {
//            studentmodel s = new studentmodel();
//            s.setName(ent.getName());
//            s.setPassword(ent.getPassword());
//
//            dto.add(s);
//            
//        }
//
//        return dto;}
	public List<studentmodel> getNameAndPassword(String name, String password) {
	    List<StudentEntity> entity = repo.findAll();
	    List<studentmodel> dto = new ArrayList<>();

	    for (StudentEntity ent : entity) {
	        studentmodel s = new studentmodel();
	        s.setName(ent.getName());
	        s.setPassword(ent.getPassword());

	        dto.add(s);
	    }

	    return dto;
	}
    	
    	
    	
    
//	@Override
//	public studentmodel getstudentId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public String postallDetails(studentmodel dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public studentmodel getStudentByNameandPassword(String name, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
