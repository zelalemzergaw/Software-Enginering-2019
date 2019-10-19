package edu.mum.cs425.studentdata.repository;

import edu.mum.cs425.studentdata.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
