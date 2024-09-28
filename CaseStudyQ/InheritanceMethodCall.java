/*Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display()” that prints the name, age, and salary of 
the employee.
Create an object of the “Person” class and call the “display()” method.
Create an object of the Employee class and call the “display()” method. */
package CaseStudyQ;

class Person 
{
    public String name="purnima";
    public int age=18;
    public void display()
    {
        System.out.println("Name:"+name+"\n"+"Age:"+age);
    }
}
class Employee extends Person
{
    public int salary=40000;
    @Override
    public void display()
    {
        System.out.println("\nSalary:"+salary);
    }
}
public class InheritanceMethodCall {
    public static void main(String[] args) {
        Person obj=new Person();
        obj.display();
        Employee obj1= new Employee();
        obj1.display();
    }
    
}
