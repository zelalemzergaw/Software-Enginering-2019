package edu.mum.cs425.studentdata.service.services;

import edu.mum.cs425.studentdata.model.Course;

public interface CourseServiceImpl {
    Course Save(Course course);
    Course getCourseById(int id);
}
