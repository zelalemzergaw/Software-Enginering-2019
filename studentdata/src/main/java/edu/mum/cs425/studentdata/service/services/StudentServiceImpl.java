package edu.mum.cs425.studentdata.service.services;

import edu.mum.cs425.studentdata.model.Student;

import java.util.List;

public interface StudentServiceImpl {
   // List<Student> getPassingStudentOnly();
    Student getStudentById(long id);

}
