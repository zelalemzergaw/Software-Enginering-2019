package edu.mum.cs.cs425.eregistrar.eregistrar.model;

import org.hibernate.mapping.PrimaryKey;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @NotBlank(message = "Student number can not be blank")
    @Column(nullable = false)
    private String studentNo;
    @NotBlank(message = "First name can not be blank")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last Name can not be blank")
    private String lastName;
    @Digits(integer = 1,fraction = 1, message = "Check your number format. Should have one decimal point")
    @Min(value = 0,message = "Can not be less tha Zero")
    @Max(value = 4,message = "Can not be more than 4")
    private Double cgpa;
    //    @NonNull@NotBlank@NotEmpty@Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;
    //    @NonNull@NotBlank@NotEmpty@Column(nullable = false)
    private String international;

    public Student() {
    }

    public Student(String studentNo, String firstName, String middleName, String lastName, Double cgpa, LocalDate enrollmentDate, String international) {
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.international = international;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNo='" + studentNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate=" + enrollmentDate +
                ", international='" + international + '\'' +
                '}';
    }
}
