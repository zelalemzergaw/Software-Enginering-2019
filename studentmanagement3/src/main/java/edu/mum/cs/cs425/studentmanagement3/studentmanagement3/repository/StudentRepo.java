package edu.mum.cs.cs425.studentmanagement3.studentmanagement3.repository;

import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model.Student;
import org.springframework.stereotype.Repository;



import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
