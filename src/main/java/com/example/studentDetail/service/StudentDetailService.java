package com.example.studentDetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentDetail.dao.StudentDetailDao;
import com.example.studentDetail.entity.Student;

@Service
public class StudentDetailService {
	@Autowired
	StudentDetailDao studDao;

	public String add(Student s) {
		return studDao.add(s);
	}

	public Student getvalue(int id) {
		return studDao.getvalue(id);
	}

	public String deleteId(int id) {
		return studDao.deleteId(id);
	}

	public String addallStudent(List<Student> s) {
		return studDao.addallStudent(s);
	}

	public List<Student> getAll() {
		return studDao.getAll();
	}

	public String update(Student id) {
		return studDao.update(id);
	}
	public String getNameById(int id) {
		return studDao.getNameById(id);
	}

}
