package edu.mum.cs.cs425.studentmgmt.studentmgmt.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    public long studentId;

    @Column(name = "STUDENT_NUMBER",nullable = false)
    public String studentNumber;

    @Column(name = "FIRST_NAME")
    public String firstName;


    @Column(name = "MIDDLE_NAME")
    public String middleName;

    @Column(name = "LAST_NAME")
    public String lastName;

    @Column(name = "CGPA")
    public double cgpa;

    @Column(name = "DATE_OFO_ENROLLMENT")
    //@Temporal(value=TemporalType.DATE)
    public LocalDate dateOfEnrollment;

    public Student() {
    }

    public Student(long studentId, String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
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

    public double getCgpa() {
        return cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
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

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
