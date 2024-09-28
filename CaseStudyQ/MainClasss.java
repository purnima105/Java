package CaseStudyQ;
/*Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, 
Developer, and Programmer.Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating 
bonuses, generating performance reports, and managing projects.*/
class Employee
{
    public void print()
    {
        System.out.println("\nREPORT:\n");
    }
}
class Manager extends Employee
{
    String name="Purnima Gupta";
    String address ="Biratnagar";
    double salary=40000;
    String job_title="MANAGER";
    double b;
    public void bonus()
    {
        if(salary>=30000)
        {
            b=salary+(salary*0.10);
        }
        System.out.println("Name: "+name+"\n"+"Address: "+address+"\n"+"Salary: "+salary+"\n"+"Job Title: "+job_title+"\n"+"Bonus with salary: "+b);
    } 
}
class Developer extends Employee
{
    String name="Ram Dev";
    String address ="Pokhara";
    double salary=50000;
    String job_title="Developer";
    double b;
    public void bonus()
    {
        if(salary>=40000)
        {
            b=salary+(salary*0.10);
        }
        System.out.println("Name: "+name+"\n"+"Address: "+address+"\n"+"Salary: "+salary+"\n"+"Job Title: "+job_title+"\n"+"Bonus: "+b);
    }
}
class Programmer extends Employee
{
    String name="Shyam Jha";
    String address ="Ilam";
    double salary=40000;
    String job_title="Programmer";
    double b;
    public void bonus()
    {
        if(salary>=30000)
        {
            b=salary+(salary*0.10);
        }
        System.out.println("Name: "+name+"\n"+"Address: "+address+"\n"+"Salary: "+salary+"\n"+"Job Title: "+job_title+"\n"+"Bonus: "+b);
    }
}
public class MainClasss {
    public static void main(String[] args) {
        Manager objj=new Manager();
        objj.print();
        objj.bonus();
       
        Developer objjj=new Developer();
        objjj.print();
        objjj.bonus();

        Programmer obj = new Programmer();
        obj.print();
        obj.bonus();  
    }  
}
