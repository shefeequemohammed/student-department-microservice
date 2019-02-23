package com.shef.student.controller;

import com.shef.student.domain.Student;
import com.shef.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{firstName}/{lastName}")
    public ResponseEntity<Student> getStudent(
            @PathVariable String firstName,
            @PathVariable String lastName){

        return ResponseEntity.ok(studentService.getStudentByFirstNameAndLastName(firstName,lastName));
    }

}
