/*Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() 
method to run */
package CaseStudyQ;

class Animal
{
    public void move()
    {
          System.out.println(" moving ");
    }

}
class Cheetah extends Animal
{
   @Override
   public void move()
   {
    System.out.println("to run");
   }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Cheetah obj = new Cheetah();
        obj.move();
    }
    
}
