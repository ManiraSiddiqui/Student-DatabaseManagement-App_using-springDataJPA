package com.manira.spring_data_jpa;


import com.manira.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);
		        Student s1=context.getBean(Student.class);
				Student s2=context.getBean(Student.class);
				Student s3=context.getBean(Student.class);

				s1.setRollNo(101);
				s1.setName("Ravi");
				s1.setMarks(70);

		s2.setRollNo(102);
		s2.setName("Ravali");
		s2.setMarks(75);

	//	s3.setRollNo(103);
	//	s3.setName("Ravir");
	//	s3.setMarks(80);

	//	repo.save(s1);
	//	repo.save(s2);
	//	repo.save(s3);

	//	System.out.println(repo.findById(101));

		s3.setRollNo(103);
		s3.setName("Ravir");
		s3.setMarks(85);

		//repo.save(s3);
		repo.delete(s2);

	}

}
