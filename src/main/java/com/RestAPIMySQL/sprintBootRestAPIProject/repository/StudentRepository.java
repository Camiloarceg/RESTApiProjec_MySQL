package com.RestAPIMySQL.sprintBootRestAPIProject.repository;

import com.RestAPIMySQL.sprintBootRestAPIProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
