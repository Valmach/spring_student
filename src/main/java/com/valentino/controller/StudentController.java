package com.valentino.controller;

import com.valentino.Entity.Student;
import com.valentino.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by valmach on 05/04/2017. Dependcy injection , decoupled for flexibility
 */
@RestController
@RequestMapping("/students") //HTTP endpoint
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.removeStudentById(id);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteStudentById(@RequestBody Student student) {
        studentService.updateStudent(student);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void inseertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }
}