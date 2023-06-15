package de.iav.studendb_jakarta.repository;

import de.iav.studendb_jakarta.exception.StudentNotFoundException;
import de.iav.studendb_jakarta.model.Student;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@ApplicationScoped
public class StudentRepository {

    List<Student> studentList;

    public StudentRepository() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public Student getStudentById(String id){
        for(Student student : studentList){
            if(student.id().equals(id)){
                return student;
            }
        }
        throw new StudentNotFoundException(id);
    }

    public Student addStudent(Student student){
        studentList.add(student);
        return student;
    }
}
