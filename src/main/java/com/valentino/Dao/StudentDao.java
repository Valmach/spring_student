package com.valentino.Dao;

import com.valentino.Entity.Student;

import java.util.Collection;

/**
 * Created by valmach on 05/04/2017.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertSutudentToDb(Student student);
}
