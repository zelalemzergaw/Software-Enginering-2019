package mum.edu.cs.cs425.banking.banking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    @Id
    @GeneratedValue
    private Long accountId;
    private Long accountNumber;
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "account_type_id_fk")
    private AccountType accountType;
    @ManyToOne
    @JoinColumn(name = "customer_id_fk")
    private Customer customer;
    @Transient
    private Long existingCustomerId;
    @Transient
    private Long accountTypeId;

}
