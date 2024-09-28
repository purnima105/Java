/*Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() 
method to print "Repairing a car".*/
package CaseStudyQ;

class Vehicle
{
    
    public void drive()
    {
       System.out.println("hi");
    }
}
class Car extends Vehicle
{
    //@Override
    public void drive()
    {
       System.out.println("Reparing the car");
    }
}
public class Overriding {
    public static void main(String[] args) {
        
        Car obj=new Car();
        obj.drive();
        
    }
    
}
