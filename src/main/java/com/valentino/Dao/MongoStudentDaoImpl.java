package com.valentino.Dao;

import com.valentino.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by valmach on 05/04/2017.
 */
@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {


    //Connection mongoConnection; //template class comes next
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                (new Student(1, "Jon", "Engineering"))
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertSutudentToDb(Student student) {

    }
}
