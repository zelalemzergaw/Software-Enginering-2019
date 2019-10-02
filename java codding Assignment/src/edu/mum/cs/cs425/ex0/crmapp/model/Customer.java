package edu.mum.cs.cs425.ex0.crmapp.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private String id;

    private String name;

    private LocalDate dateOfBirth;

    public Customer() {
    }

    public Customer(String id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer :{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}' + "\n";
    }
    public static void main(String [] args){
    Customer c1 =new Customer("3109128478","John Dean",LocalDate.of(1989,07,12));
    Customer c2 =new Customer("2910019138","Anna Smith",LocalDate.of(1977,01,31));
    Customer c3 =new Customer("3109128478","John",LocalDate.of(1989,11,18));
    Customer [] cust={c1,c2,c3};
    System.out.println(Arrays.toString(cust));
    }
}
