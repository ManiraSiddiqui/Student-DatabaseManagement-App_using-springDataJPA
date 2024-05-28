package com.manira.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manira.spring_data_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
