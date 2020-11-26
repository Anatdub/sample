
// класс Bank 
class Bank  
{ 
    private String name; 
      
    // имя банка 
    Bank(String name) 
    { 
        this.name = name; 
    } 
      
    public String getBankName() 
    { 
        return this.name; 
    } 
}  
  
// класс Employee 
class Employee 
{ 
    private String name; 
      
    // имя employee 
    Employee(String name)  
    { 
        this.name = name; 
    } 
      
    public String getEmployeeName() 
    { 
        return this.name; 
    }  
} 
  
// Ассоциация  между двумя классами  
// в методе main 
class Association  
{ 
    public static void main (String[] args)  
    { 
        Bank bank = new Bank("Axis"); 
        Employee emp = new Employee("Ivanov"); 
          
        System.out.println(emp.getEmployeeName() +  
               " is employee of " + bank.getBankName()); 
    } 
}
