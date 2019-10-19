package edu.mum.cs425.studentdata.repository;

import edu.mum.cs425.studentdata.model.Classroom;
import edu.mum.cs425.studentdata.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query("select s from Student where s.cgpa>?3 order by s.name")
//  List<Student> getStudentByCgpaGreaterThan3(float cgpa);
}
