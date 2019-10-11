package edu.mum.cs425exercise.studentdata.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transcripts")
public class Transcript {
    private long id;

    private String degreeTitle;

    private Student student;

    public Transcript(long id, String degreeTitle, Student student) {
        this.id = id;
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
