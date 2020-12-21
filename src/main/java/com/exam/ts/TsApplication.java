package com.exam.ts;

import com.exam.ts.model.Student;
import com.exam.ts.model.Supervisor;
import com.exam.ts.repository.StudentRepository;
import com.exam.ts.repository.SupervisorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(TsApplication.class, args);
        SupervisorRepository supervisorRepository =
                configurableApplicationContext.getBean(SupervisorRepository.class);
        StudentRepository studentRepository =
                configurableApplicationContext.getBean(StudentRepository.class);

        /* Testing one to many, look in h2 for result
        Student firstStudent = new Student("Ann");
        Student secondStudent = new Student("Anne");
        List<Student> students = Arrays.asList(firstStudent, secondStudent);

        Supervisor supervisor = new Supervisor("Lars", students);
        supervisorRepository.save(supervisor);

        Student thirdStudent = new Student("asjf");
        Student fourthStudent = new Student("Ansdafgne");
        List<Student> students2 = Arrays.asList(thirdStudent, fourthStudent);

        Supervisor supervisor2 = new Supervisor("Niels", students2);
        supervisorRepository.save(supervisor2);
         */
    }

}
