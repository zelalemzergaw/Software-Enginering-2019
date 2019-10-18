package edu.mum.cs.student.eregistrar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.mapping.PrimaryKey;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotBlank(message = "Student number can not be blank")
    @Column(name = "student_no",nullable = false)
    private String studentNo;
    @NotBlank(message = "First name can not be blank")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last Name can not be blank")
    private String lastName;
    @Digits(integer = 1,fraction = 1, message = "Check your number format. Should have one decimal point")
    @Min(value = 0,message = "Can not be less than Zero")
    @Max(value = 4,message = "Can not be more than 4")
    private Double cgpa;
//    @NonNull@NotBlank@NotEmpty@Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate enrollmentDate;
//    @NonNull@NotBlank@NotEmpty@Column(nullable = false)
    private String international;

}
