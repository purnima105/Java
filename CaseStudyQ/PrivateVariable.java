package CaseStudyQ;


class Student
{
    private String name;
    private int age ;
    public void setData(String Name,int Age)
    {
        name=Name;
        age=Age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class PrivateVariable {
    public static void main(String[] args) {
        Student s[]= new Student[10];
           s[0]=new Student();
           s[0].setData("purnima",18);
           s[1]=new Student();
           s[1].setData("ram",87);
           s[2]=new Student();
           s[2].setData("sita",19);
           s[3]=new Student();
           s[3].setData("hari",18);
           s[4]=new Student();
           s[4].setData("shyam",18);
           s[5]=new Student();
           s[5].setData("ramu",18);
           s[6]=new Student();
           s[6].setData("gyanu",18);
           s[7]=new Student();
           s[7].setData("gita",18);
           s[8]=new Student();
           s[8].setData("purab",18);
           s[9]=new Student();
           s[9].setData("pachim",18);

        
        for (int i=0;i<10;i++)
        {
            System.out.println("name="+s[i].getName()+" \nAge="+s[i].getAge());
        }
        
    }
    
}
