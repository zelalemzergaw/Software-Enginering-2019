package edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long transcriptId; //: primaryKey, degreeTitle
	
	String degreeTitle;

	
	public Transcript() {
		
	}
	
	public Transcript(String degreeTitle) { 
		this.degreeTitle = degreeTitle;
	}

	public long getTranscriptId() {
		return transcriptId;
	}

	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}

	public String getDegreeTitle() {
		return degreeTitle;
	}

	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	
}
