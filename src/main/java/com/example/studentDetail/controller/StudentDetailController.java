package com.example.studentDetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.studentDetail.entity.Student;
import com.example.studentDetail.exception.AgeException;
import com.example.studentDetail.service.StudentDetailService;

@RestController
public class StudentDetailController {
	@Autowired
	StudentDetailService studSer;

	@PostMapping(value = "/addvalue")
	public String add(@RequestBody Student s) throws AgeException {
		if (s.getAge() > 18) {
			return studSer.add(s);
		} else {
			throw new AgeException();

		}

	}

	@GetMapping(value = "getvalue/{id}")
	public Student get(@PathVariable int id) {
		return studSer.getvalue(id);
	}

	@DeleteMapping(value = "/deleteidforStudent/{id}")
	public String deleteId(@PathVariable int id) {
		return studSer.deleteId(id);
	}

	@PostMapping(value = "/addAll")
	public String addallEmployee(@RequestBody List<Student> s) {
		return studSer.addallStudent(s);
	}

	@GetMapping(value = "/getAll")
	public List<Student> getAll() {
		return studSer.getAll();
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Student id) {
		return studSer.update(id);
	}
	@GetMapping(value="/getNameById/{id}")
	public String getNameById(@PathVariable int id) {
		return studSer.getNameById(id);
	}

}
