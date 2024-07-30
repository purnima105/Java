package Inheritance;

class BaseClass {
    public void disp() {
        System.out.println("This is Base Class");
    }
}
class DerivedClass extends BaseClass {
    public void disp1() {
        System.out.println("This is Derived Class");
    }
}

public class SingleLevelMethod {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.disp();
        obj.disp1();
    }
}
