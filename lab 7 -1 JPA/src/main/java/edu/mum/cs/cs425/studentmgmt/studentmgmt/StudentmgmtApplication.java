package edu.mum.cs.cs425.studentmgmt.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.studentmgmt.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {

@Autowired
private LocalContainerEntityManagerFactoryBean factoryBean;

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);

    }



    @Override
    public void run(String... args)  {
        System.out.println("....Student management project....");
    Student std= new Student(1,"000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019,05,24));
    saveStudents(std);
        System.out.println("....Finishing Student management....");
        System.out.printf( "Saved Student: { studentId:%d, student number:%d,first name:%s,middle name:%s,last name:%s, cgpa:%.2f, date of enrollement:%s}\n", std.getStudentId(),
                std.getStudentNumber(), std.getFirstName(), std.getMiddleName(),std.getLastName(),std.getDateOfEnrollment());

    }
    private void saveStudents(Student s){
        if(s!=null) {
            EntityManager em=factoryBean.getObject().createEntityManager();
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
            em.close();

        }
    }
}
