public class Customer{
   private String id;

   private String name;

   private LocalDate dateOfBirth; 

public Customer(){

}
 
public Customer (String id, String name,LocalDate dateOfBirth){
  
 this.id=id;
 this.name;
 this.dateOfBirth;

}

public String id(){
return id;
}

public String name(){
return name;
}

public LocalDate dateOfBirth(){
return dateOfBirth;
}

public void id(String id){
   this.id=id;
}

public void name(String name){
   this.name=name;
}


public void id(LocalDate dateOfBirth){
   this.dateOfBirth=dateOfBirth;
}


public static void main(String []args){
 
Customer c1=new Customer("3109128478","John Dean",LocalDate.of(1989,07,12));
 
Customer c1=new Customer("2910019138","Anna Smith",LocalDate.of(1977,01,31)); 

Customer c1=new Customer("7281100287","Albert Enstein",LocalDate.of(1951,11,1951));

Customer [] cust={c1,c2,c3};
System.out.println(Arrays.toString(cust));

}
}