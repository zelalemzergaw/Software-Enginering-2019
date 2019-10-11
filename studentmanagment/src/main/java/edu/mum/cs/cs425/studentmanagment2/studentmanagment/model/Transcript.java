package edu.mum.cs.cs425.studentmanagment2.studentmanagment.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "TRANSCRIPTS")
public class Transcript {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    private long transcriptId;

    @Column(name = "DEGREE_TITLE")
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript",cascade = CascadeType.ALL)
    @JoinColumn(name = "STUDENT",nullable = false)
    private Student student;

    public Transcript() {
    }


    public Transcript(long transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;

    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
