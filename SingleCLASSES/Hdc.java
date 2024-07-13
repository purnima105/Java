package SingleCLASSES;
//5.Multiple classes.......
class Bim
{
    String course="BIM";
    int no_of_student=33;
    public void disp()
    {
    System.out.println(course+"\n"+"No.of Student="+no_of_student);
    }
}
    class Bca
    {
        String course="BCA";
        int no_of_student=35;
        public void disp()
        {
        System.out.println(course+"\n"+"No.of Student="+no_of_student);
        }
    }
    class Bhm
    {
        String course="BHM";
        int no_of_student=30;
        public void disp()
        {
        System.out.println(course+ "\n"+"No.of Student= "+no_of_student);
        }
    }
    public class Hdc
    {
    public static void main(String[]args)
    {
        Bim obj1= new Bim();
        obj1.disp();
        Bca obj2= new Bca();
        obj2.disp();
        Bhm obj3= new Bhm();
        obj3.disp(); 

    }
}
    

