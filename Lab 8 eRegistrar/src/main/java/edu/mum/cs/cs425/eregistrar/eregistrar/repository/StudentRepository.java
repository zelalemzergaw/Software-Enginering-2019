package edu.mum.cs.cs425.eregistrar.eregistrar.repository;

import edu.mum.cs.cs425.eregistrar.eregistrar.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.awt.print.Pageable;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    Page<Student> findStudentByFirstNameContainsOrLastNameContainsOrMiddleNameContainsOrStudentNoContainsOrInternationalContainsOrderByFirstName(String search, String search1, String search2, String search3, String search4, PageRequest firstName);
}
