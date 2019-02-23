package com.shef.student.service;

import com.shef.student.domain.Student;

public interface StudentService {

    Student getStudentByFirstNameAndLastName(String firstName, String lastName);

    Student save(Student student);


}
