package mum.edu.cs.cs425.banking.banking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @NotBlank(message = "*please input customer number")
    @Column(name = "customer_number")
    private long customerNumber;

    @Column(name = "first_name")
    @NotBlank(message = "*please input your name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "email")
    @NotBlank(message = "please input valid email")
    private String emailAddress;

    @Column(name = "contact_phone_number")
    private String contactPhoneNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accountList= new ArrayList<Account>();

    @Transient
    private Long accountType;
    @Transient
    private Long accountNumber;

    @Transient
    private Double balance;
    @Transient
    private String accountDetails;









}
