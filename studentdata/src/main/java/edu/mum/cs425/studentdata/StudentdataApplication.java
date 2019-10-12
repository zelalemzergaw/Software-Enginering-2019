package edu.mum.cs425.studentdata;

import edu.mum.cs425.studentdata.model.Classroom;
import edu.mum.cs425.studentdata.model.Course;
import edu.mum.cs425.studentdata.model.Student;
import edu.mum.cs425.studentdata.model.Transcript;
import edu.mum.cs425.studentdata.service.ClassroomService;
import edu.mum.cs425.studentdata.service.CourseService;
import edu.mum.cs425.studentdata.service.StudentService;
import edu.mum.cs425.studentdata.service.TranscriptService;
import edu.mum.cs425.studentdata.service.services.ClassRoomServiceImpl;
import edu.mum.cs425.studentdata.service.services.CourseServiceImpl;
import edu.mum.cs425.studentdata.service.services.StudentServiceImpl;
import edu.mum.cs425.studentdata.service.services.TranscriptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentdataApplication implements CommandLineRunner  {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private ClassRoomServiceImpl classroomService;

    @Autowired
    private CourseServiceImpl courseService;

    @Autowired
    private TranscriptServiceImpl transcriptService;

    public static void main(String[] args) {
       SpringApplication.run(StudentdataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello StudentRegistrationApp!!!");
        // Create 3 new classrooms
        Classroom cr1 = new Classroom("McLaughlin building", "M105");
        Classroom cr2 = new Classroom("Verrill Hall", "V29");
        Classroom cr3 = new Classroom("Dreier Building", "#3");
        // Create 3 new courses
        Course c1 = new Course("FPP", "CS390", 4.0f);
        Course c2 = new Course("MPP", "CS401", 4.0f);
        Course c3 = new Course("SWE", "CS425", 4.0f);
        Course[] courses = {c1, c2, c3};

        // Create 5 new Transcripts
        Transcript tr1 = new Transcript("BS Computer Science");
        Transcript tr2 = new Transcript("MS Computer Science");
        Transcript tr3 = new Transcript("BS Mathematics");
        Transcript tr4 = new Transcript("PhD Vedic Science");
        Transcript tr5 = new Transcript("MA Film Production");

        // Create 5 new students
        Student s1 = new Student(980001L, "John A. Smith", 3.94f, LocalDate.of(2018, 10, 24),tr1);
        Student s2 = new Student(980002L, "Anna-Marie Jones", 3.05f, LocalDate.of(2019, 3, 15),tr2);
        Student s3 = new Student(980003L, "Peter Harrington", 2.90f, LocalDate.of(2018, 10, 24),tr3);
        Student s4 = new Student(980004L, "Ducarmel R. Saint-Jean", 3.77f, LocalDate.of(2018, 10, 24),tr4);
        Student s5 = new Student(980005L, "Mary W. Washington", 3.26f, LocalDate.of(2019, 3, 13),tr5);

        tr1.setStudent(s1);
        tr2.setStudent(s2);
        tr3.setStudent(s3);
        tr4.setStudent(s4);
        tr5.setStudent(s5);



    }
}
