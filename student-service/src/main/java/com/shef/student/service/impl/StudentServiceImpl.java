package com.shef.student.service.impl;

import com.shef.student.domain.Student;
import com.shef.student.repository.StudentRepository;
import com.shef.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return studentRepository.findByFirstNameAndLastName(firstName,lastName);
    }

    @Override
    public Student save(Student student) {
       return studentRepository.save(student);
    }
}
