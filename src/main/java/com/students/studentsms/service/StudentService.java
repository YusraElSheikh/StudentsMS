package com.students.studentsms.service;

import com.students.studentsms.entity.Student;

import java.util.List;

public interface StudentService  {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student UpdateStudent(Student student);

    void deleteStudentById(Long id);


}
