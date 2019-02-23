package com.shef.student;

import com.shef.student.domain.Student;
import com.shef.student.repository.StudentRepository;
import com.shef.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApp implements CommandLineRunner {
    public static void main(String args[]){
        SpringApplication.run(StudentApp.class);
    }

    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student();
        student1.setFirstName("James");
        student1.setLastName("Bond");
        student1.setHouseNo("FLAT 101, ABC TOWERS");
        student1.setStreet("DEF street");
        student1.setCity("ABUDHABI");
        student1.setCountry("UAE");
        studentService.save(student1);

        Student student2 = new Student();
        student2.setFirstName("Martin");
        student2.setLastName("Flower");
        student2.setHouseNo("FLAT 102, FGH TOWERS");
        student2.setStreet("KJH street");
        student2.setCity("Dubai");
        student2.setCountry("UAE");
        studentService.save(student2);

        Student student3 = new Student();
        student3.setFirstName("Robert");
        student3.setLastName("Frost");
        student3.setHouseNo("FLAT 103, SDF TOWERS");
        student3.setStreet("AZX street");
        student3.setCity("London");
        student3.setCountry("UK");
        studentService.save(student3);


    }
}
