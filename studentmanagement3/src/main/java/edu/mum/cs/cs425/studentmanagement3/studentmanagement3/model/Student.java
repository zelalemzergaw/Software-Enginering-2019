package edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long studentId;// : long (Primary key)
	String studentNumber; // : (required) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
	String firstName; // : (required) (e.g.  Data values: "Anna", "Bob" etc.)

	String middleName; // : (is optional) (e.g.  Data values: "Lynn", "" etc.)

	String lastName;  //: (required) (e.g.  Data values: "Smith", "Galverston" etc.)
	float cgpa;  // : (is optional) (e.g. Data values: 3.45, 2.87, etc)
	
	Date dateOfEnrollment; // (This field contains date values; representing the date of enrollment of the student)

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(name = "Class_Student", joinColumns = {@JoinColumn(name="studentId")},
						inverseJoinColumns = {@JoinColumn(name="ClassroomId")})
	Classroom classRoom;
//	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "transcriptId")
	Transcript transcript;
	
	public Student() {
		
	}
	
	
	
	public Student(String studentNumber, String firstName, String middleName, String lastName, float cgpa,
			Date dateOfEnrollment) { 
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

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public Date getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(Date dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}



	public Classroom getClassRoom() {
		return classRoom;
	}



	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}



	public Transcript getTranscript() {
		return transcript;
	}



	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	
	
	
	
}
