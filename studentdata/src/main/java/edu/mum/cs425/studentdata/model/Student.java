package edu.mum.cs425.studentdata.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name="student_number", unique = true, nullable = false)
    private Long studentNumber;

    private String name;
    private Float cgpa;

    @Column(name = "admission_date")
    private LocalDate admissionDate;

    @OneToOne
    @JoinColumn(name="transcript_id", nullable = false, unique = true)
//    @OneToOne(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Transcript transcript;

    @ManyToOne()
    @JoinColumn(name = "classroom_id", nullable = true)
    private Classroom classroom;

    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="students_courses",
            joinColumns={@JoinColumn(name="student_id", referencedColumnName="student_id")},
            inverseJoinColumns={@JoinColumn(name="course_id", referencedColumnName="course_id")})
    private List<Course> courses=new ArrayList<Course>();

    public Student() {
    }

    public Student(Long studentNumber, String name, Float cgpa, LocalDate admissionDate, Transcript transcript) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.admissionDate = admissionDate;
        this.transcript = transcript;
    }

    public Student(Long studentNumber, String name, Float cgpa, LocalDate admissionDate, Transcript transcript, Classroom cr) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.admissionDate = admissionDate;
        this.transcript = transcript;
        this.classroom = cr;
    }

    public Student(Long studentId, Long studentNumber, String name, Float cgpa, LocalDate admissionDate, Transcript transcript, Classroom cr) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.admissionDate = admissionDate;
        this.transcript = transcript;
        this.classroom = cr;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", admissionDate=" + admissionDate +
                ", " + transcript +
                ", " + classroom +
                '}';
    }
}
