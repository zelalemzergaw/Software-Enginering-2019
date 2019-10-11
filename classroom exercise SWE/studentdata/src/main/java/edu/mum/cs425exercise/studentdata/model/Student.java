package edu.mum.cs425exercise.studentdata.model;

import com.sun.jdi.NativeMethodException;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @Column(name = "student_number")
    private String studentNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "cgpa")
    private float cgpa;

    @Column(name ="date_of_entry")
    private LocalDate dateOfEntry;

    @ManyToMany(cascade =CascadeType.MERGE )
    @JoinTable(name = "student_course",joinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "course_id")})
    private List<Course> courses =new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "")
    private List<Class> classes;

    private Transcript transcript;

    public Student() {
    }

    public Student(long studentId, String studentNumber, String firstName, String middleName, String lastName,
                   float cgpa, LocalDate dateOfEntry, List<Course> courses, List<Class> classes, Transcript transcript) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEntry = dateOfEntry;
        this.courses = courses;
        this.classes = classes;
        this.transcript = transcript;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getCgpa() {
        return cgpa;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEntry=" + dateOfEntry +
                ", courses=" + courses +
                ", classes=" + classes +
                ", transcript=" + transcript +
                '}';
    }
}
