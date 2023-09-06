package com.students.studentsms.service.impl;

import com.students.studentsms.entity.Student;
import com.students.studentsms.repository.StudentsRepository;
import com.students.studentsms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentsRepository studentsRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentsRepository.findById(id).get();
    }

    @Override
    public Student UpdateStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentsRepository.deleteById(id);
    }
}
