package de.iav.studendb_jakarta.controller;

import de.iav.studendb_jakarta.model.Student;
import de.iav.studendb_jakarta.repository.StudentRepository;
import de.iav.studendb_jakarta.service.StudentService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.util.List;

@Path("studentDB")
public class StudentController {

    private final StudentService studentService;

    @Inject
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentById(@PathParam("id") String id){
        return studentService.getStudentById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student addStudent(@Valid Student student){
        return studentService.addStudent(student);
    }
}
