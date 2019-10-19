package edu.mum.cs425.studentdata.service;

import edu.mum.cs425.studentdata.model.Course;
import edu.mum.cs425.studentdata.repository.CourseRepository;
import edu.mum.cs425.studentdata.service.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements CourseServiceImpl {
    @Autowired
    public CourseRepository courseRepository;
    @Override
    public Course Save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }
}
