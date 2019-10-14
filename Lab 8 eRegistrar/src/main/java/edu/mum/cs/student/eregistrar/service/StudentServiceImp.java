package edu.mum.cs.student.eregistrar.service;

import edu.mum.cs.student.eregistrar.model.Student;
import edu.mum.cs.student.eregistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository stRepo;

    @Override
    public List<Student> getAllStudents() {
        return stRepo.findAll(Sort.by("firstName"));
    }
    @Override
    public Page<Student> getAllStudentsPaged(int pageNo) {
        return stRepo.findAll(PageRequest.of(pageNo, 10, Sort.by("firstName")));
    }

    @Override
    public Iterable<Student> getIAllStudents() {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return stRepo.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        stRepo.delete(stRepo.getOne(studentId));
    }

    @Override
    public Student findById(Long studentId) {
        Student s = stRepo.getOne((Long)studentId);
        return s;
    }

    @Override
    public Page<Student> search(String search,int pageNo) {
        Page<Student> students  =stRepo.findStudentByFirstNameContainsOrLastNameContainsOrMiddleNameContainsOrStudentNoContainsOrInternationalContainsOrderByFirstName(search,search,search,search,search, PageRequest.of(pageNo, 10, Sort.by("firstName")));
        return students;
    }
}
