/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rasha.STUDENT;

import java.util.List;

/**
 *
 * @author RASHA
 */
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
