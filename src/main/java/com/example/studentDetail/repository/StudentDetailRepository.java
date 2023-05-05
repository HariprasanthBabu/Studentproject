package com.example.studentDetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentDetail.entity.Student;

public interface StudentDetailRepository extends JpaRepository<Student,Integer> {
	@Query(value="select name from prod_db.student where id=?",nativeQuery=true)
	public String getNameById(int id);

}
