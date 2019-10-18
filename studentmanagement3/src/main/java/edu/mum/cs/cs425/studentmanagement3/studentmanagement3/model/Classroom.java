package edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
		//(classroomId: primaryKey, buildingName, roomNumber) 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long classroomId;
	String buildingName;
	String roomNumber;
	@OneToMany(mappedBy = "classRoom", fetch = FetchType.EAGER)
	List<Student> students = new ArrayList<Student>();
	
	public Classroom() {
		
	}
	
	public Classroom(String buildingName, String roomNumber) { 
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
