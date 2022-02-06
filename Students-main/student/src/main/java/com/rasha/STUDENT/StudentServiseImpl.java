/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasha.STUDENT;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author RASHA
 */
@Service
public class StudentServiseImpl implements StudentService{
private final  StudentRepository studentRepository;

    public StudentServiseImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
     return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
}
