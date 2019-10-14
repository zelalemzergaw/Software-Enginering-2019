package edu.mum.cs.cs425.eregistrar.eregistrar.service;

import edu.mum.cs.cs425.eregistrar.eregistrar.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    public abstract List<Student> getAllStudents();
    Iterable<Student> getIAllStudents();
    Page<Student> getAllStudentsPaged(int pageNo);
    Student saveStudent(Student student);
    void  deleteStudent(Long studentId);
    Student  findById(Long studentId);
    Page<Student> search(String search,int pageNo);
}
