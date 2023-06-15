package de.iav.studendb_jakarta.controller;

import de.iav.studendb_jakarta.exception.ConstraintViolationExceptionMapper;
import de.iav.studendb_jakarta.exception.StudentNotFoundExceptionMapper;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath(("/api"))
public class StudentApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(StudentController.class);
        classes.add(StudentNotFoundExceptionMapper.class);
        classes.add(ConstraintViolationExceptionMapper.class);

        return classes;
    }
}
