package edu.mum.cs.student.eregistrar.service;

import edu.mum.cs.student.eregistrar.model.Student;
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
