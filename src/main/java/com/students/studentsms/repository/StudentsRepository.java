package com.students.studentsms.repository;

import com.students.studentsms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository <Student, Long> {
}
