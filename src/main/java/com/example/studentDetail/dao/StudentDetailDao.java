package com.example.studentDetail.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.studentDetail.entity.Student;
import com.example.studentDetail.repository.StudentDetailRepository;

@Repository
public class StudentDetailDao {
	@Autowired
	StudentDetailRepository studRepo;
	public String add(Student s) {
		studRepo.save(s);
		return "Successfully saved";
	}
	public Student getvalue(int id) {
		return studRepo.findById(id).get();
	}
	public String deleteId(int id) {
		studRepo.deleteById(id);
		return "Deleted";
	}

	public String addallStudent(List<Student> s) {
		studRepo.saveAll(s);
		return "Added";
	}

	public List<Student> getAll() {
		return studRepo.findAll();
	}

	public String update(Student s) {
		studRepo.save(s);
		return "Deleted";
	}
	public String getNameById(int id) {
		return studRepo.getNameById(id);
	}

}
