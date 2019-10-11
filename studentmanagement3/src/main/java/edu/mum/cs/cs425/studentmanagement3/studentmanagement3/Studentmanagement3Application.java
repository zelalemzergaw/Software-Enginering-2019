package edu.mum.cs.cs425.studentmanagement3.studentmanagement3;

import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model.Classroom;
import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model.Student;
import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.model.Transcript;
import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.repository.ClassromRepo;
import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.repository.StudentRepo;
import edu.mum.cs.cs425.studentmanagement3.studentmanagement3.repository.TranscriptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

;

@SpringBootApplication
public class Studentmanagement3Application implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    ClassromRepo classromRepo;
    @Autowired
    TranscriptRepo transcriptRepo;
    Classroom classroom;
    Transcript transcript;
    public static void main(String[] args) {
        System.out.println("***************************   ***** Start Program **** *************************** ");
        SpringApplication.run(Studentmanagement3Application.class, args);
        System.out.println("***************************   ***** End Program **** *************************** ");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\t\t\t\t +++++++++++++++\t Call Run Method\t\t\t\t +++++++++++++++");

        initData();

        Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45f, new Date(2019,5,24));
        student.setClassRoom(classroom);
        student.setTranscript(transcript);

        studentRepo.save(student);
    }
    public void initData() {
        classroom = classromRepo.save(new Classroom("McLaughlin building", "M105"));
        transcript = transcriptRepo.save(new Transcript("BS Computer Science"));
    }

}
