package com.valentino.service;

import com.valentino.Dao.StudentDao;
import com.valentino.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by valmach on 05/04/2017.
 */
@Service
public class StudentService {


@Autowired
@Qualifier("mongoData")
private StudentDao studentDao;

public Collection<Student>getAllStudents(){
    return this.studentDao.getAllStudents();

    }

    public Student getStudentsById(int id) {
        return this.studentDao.getStudentById(id);
    }
    public void updateStudent(Student student){
    this.studentDao.updateStudent(student);

    }
    public void insertStudent(Student student){
        this.studentDao.insertSutudentToDb(student);
    }
}

