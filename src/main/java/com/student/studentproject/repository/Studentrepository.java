package com.student.studentproject.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.*;

import com.student.studentproject.entity.StudentEntity;

public interface Studentrepository extends JpaRepository<StudentEntity ,Integer>{
	Optional<StudentEntity> findByNameAndPassword(String name,String password);

}
