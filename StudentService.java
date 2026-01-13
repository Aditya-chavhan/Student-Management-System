package com.student.management.service;

import java.util.List;
import com.student.management.model.Student;

public interface StudentService {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
