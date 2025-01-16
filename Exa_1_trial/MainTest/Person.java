package MainTest;
public  class Person
{

private void walk() { System.out.println("Person is walking"); } 
public static void main(String[] args) { 

  Object j = new Object();
  Object h = new Object();

  System.out.println(j == h);
  Person p = new Employee(); 
  p.walk(); 
} 
} 
class Employee extends Person { 
protected void walk() { System.out.println("Employee is walking"); } 
}