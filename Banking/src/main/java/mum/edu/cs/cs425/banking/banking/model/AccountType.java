package mum.edu.cs.cs425.banking.banking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "AccountType")
public class AccountType {
    @Id
    @GeneratedValue
    private Long accountTypeId;
    private String accountTypeName;

    @OneToMany(mappedBy = "accountType")
    private List<Account> accountList = new ArrayList<>();
}
