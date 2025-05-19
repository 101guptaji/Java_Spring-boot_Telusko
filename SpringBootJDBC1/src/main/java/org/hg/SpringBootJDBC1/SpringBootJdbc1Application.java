package org.hg.SpringBootJDBC1;

import org.hg.SpringBootJDBC1.model.Student;
import org.hg.SpringBootJDBC1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbc1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootJdbc1Application.class, args);
//		System.out.println("Hello HG");

		Student student = context.getBean(Student.class);
		student.setName("Himanshu");
		student.setStandard(5);
		student.setRollNo(1);
//		System.out.println(student.toString());

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(student);

		Student student2 = context.getBean(Student.class);
		student2.setName("Gupta");
		student2.setStandard(7);
		student2.setRollNo(2);

		studentService.addStudent(student2);

		List<Student> studentList = studentService.getStudents();
		System.out.println(studentList);
	}

}
