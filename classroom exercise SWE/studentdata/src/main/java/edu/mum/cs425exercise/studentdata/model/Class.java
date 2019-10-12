package edu.mum.cs425exercise.studentdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "building)_name")
    private String buildingName;

    @Column(name = "room_number")
    private String roomNumber;
    @OneToMany(mappedBy = "class")
    private List<Student> students;

    public Class(long id, String buildingName, String roomNumber, List<Student> students) {
        this.id = id;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.students = students;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public List<Student> getStudents() {
        return students;
    }
}
