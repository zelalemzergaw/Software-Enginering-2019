package edu.mum.cs425.studentdata.model;

import javax.persistence.*;

@Entity
@Table(name="transcripts")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transcript_id")
    private Long transcriptId;

    @Column(name="degree_title")
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @OneToOne
//    @JoinColumn(name="student_id", nullable = false, unique = true)
    private Student student;

    public Transcript() {
    }

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Transcript(String degreeTitle, Student student) {
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public Transcript(Long transcriptId, String degreeTitle, Student student) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
        this.student = student;
    }

    public Long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}
