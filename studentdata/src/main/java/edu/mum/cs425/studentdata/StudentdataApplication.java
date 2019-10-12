package edu.mum.cs425.studentdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentdataApplication implements CommandLineRunner  {

    public static void main(String[] args) {
       SpringApplication.run(StudentdataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
