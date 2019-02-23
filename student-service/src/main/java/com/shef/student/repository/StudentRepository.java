package com.shef.student.repository;

import com.shef.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String > {

    Student findByFirstNameAndLastName(String firstName, String lastName);
}
