package com.student.management.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.student.management.model.Student;
import com.student.management.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
}
