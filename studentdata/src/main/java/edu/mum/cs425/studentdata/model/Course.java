package edu.mum.cs425.studentdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private int courseId;
    @Column(nullable=false, unique=true)
    private String name;
    @Column(name="course_code")
    private String courseCode;
    @Column(name="number_of_units")
    private float numberOfUnits;

    @ManyToMany(mappedBy="courses")
    private List<Student> students;

    public Course() {
    }

    public Course(String name, String courseCode, float numberOfUnits) {
        this.name = name;
        this.courseCode = courseCode;
        this.numberOfUnits = numberOfUnits;
    }

    public Course(int courseId, String name, String courseCode, float numberOfUnits) {
        this.courseId = courseId;
        this.name = name;
        this.courseCode = courseCode;
        this.numberOfUnits = numberOfUnits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public float getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(float numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
