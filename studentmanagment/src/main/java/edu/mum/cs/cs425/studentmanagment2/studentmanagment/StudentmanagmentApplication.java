package edu.mum.cs.cs425.studentmanagment2.studentmanagment;

import edu.mum.cs.cs425.studentmanagment2.studentmanagment.model.Student;
import edu.mum.cs.cs425.studentmanagment2.studentmanagment.model.Transcript;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentmanagmentApplication {

    private static final String PERSISTENCE_UNIT_NAME = "Studentmanagment2";
    private static EntityManagerFactory factory;

    public StudentmanagmentApplication() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagmentApplication.class, args);
        System.out.println( "Starting ProductMgmtApp2..." );
        StudentmanagmentApplication app = new StudentmanagmentApplication();
        Transcript s1 = new Transcript(1, "Bs computer science");
        Student p1 = new Student(1,"000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019,05,24),s1);
       // Student p2 = new Student(2,"000-61-0002","Tom","Joe","Eric",3.35, LocalDate.of(2018,06,24));
        //Student [] students = new Student[] { p1, p2 };
        s1.setStudent(p1);
      app.saveStudentTranscript(s1);
        //app.saveSupplierAndProducts(s1);
        System.out.printf( "Saved Student: { studentId:%d, student number:%d,first name:%s,middle name:%s,last name:%s, cgpa:%.2f, date of enrollement:%s}\n", p1.getStudentId(),
                p1.getStudentNumber(), p1.getFirstName(), p1.getMiddleName(),p1.getLastName(),p1.getDateOfEnrollment());
//        System.out.printf( "Saved Product: { productId:%d, name:%s, unitPrice:%.2f, dateMfd:%s }\n",
//                p2.getProductId(), p2.getName(), p2.getUnitPrice(), p2.getDateMfd());
        System.out.println( "Finishing student transcript..." );
    }

    private void saveStudentTranscript(Transcript ts) {
        if (ts != null) {
            EntityManager em = factory.createEntityManager();
            em.getTransaction().begin();
            em.persist(ts);
            em.getTransaction().commit();
            em.close();
            factory.close();
        }
    }

}
