package edu.mum.cs425.studentdata.service;

import edu.mum.cs425.studentdata.model.Student;
import edu.mum.cs425.studentdata.repository.StudentRepository;
import edu.mum.cs425.studentdata.service.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    public StudentRepository studentRepository;
//    @Override
//    public List<Student> getPassingStudentOnly() {
//        return studentRepository.getStudentByCgpaGreaterThan3(3.0f);
//    }

    @Override
    public Student getStudentById(long id) {
        return null;
    }
}
