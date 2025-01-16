package UNIQUE.Question9;

import java.util.function.Predicate; 

class Employee{     
    int age;   //1 
    }  public class TestClass{     
        public static boolean validateEmployee(
            Employee e, Predicate<Employee> p){        
                return p.test(e);    
            }         
            public static void main(String[] args) {        
                Employee e = new Employee(); //2        
                System.out.println(validateEmployee(e, f->e.age<10000)); //3    

                Employee emp = new Employee();
                Employee epm1 = new Employee();
                Employee emp2 = emp;
                System.out.println(emp == emp2);
                System.out.println(epm1.equals(emp2));
                System.out.println(emp == epm1);

                
                } 
            }