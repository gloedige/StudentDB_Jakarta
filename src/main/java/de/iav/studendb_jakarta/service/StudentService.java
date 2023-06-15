package de.iav.studendb_jakarta.service;

import de.iav.studendb_jakarta.model.Student;
import de.iav.studendb_jakarta.repository.StudentRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService() {
    }
    @Inject
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentList(){
        return studentRepository.getStudentList();
    }
    public Student getStudentById(String id){
        return studentRepository.getStudentById(id);
    }
    public Student addStudent(Student student){
        return studentRepository.addStudent(student);
    }
}
