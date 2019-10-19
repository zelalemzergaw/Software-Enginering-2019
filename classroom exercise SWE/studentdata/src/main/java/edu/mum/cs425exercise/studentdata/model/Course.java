package edu.mum.cs425exercise.studentdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "course_title")
    private String courseTitle;

    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public Course(long id, String courseTitle, List<Student> students) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseTitle='" + courseTitle + '\'' +
                ", students=" + students +
                '}';
    }
}
