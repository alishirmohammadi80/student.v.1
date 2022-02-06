/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasha.STUDENT;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author RASHA
 */
@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String listStudents(Model model){
     model.addAttribute("students",studentService.getAllStudents());
     return "students";
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student=new Student();
    model.addAttribute("student",student);
    return "creata_student";
        
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute ("student") Student student){
        
      studentService.saveStudent(student);
        
      return "redirect:/students";
    }
}
