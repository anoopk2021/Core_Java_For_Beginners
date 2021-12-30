package inheritance;

public class Demo {


    public void m1(){

        System.out.println("inside m1 method of Parent class");
    }

    public void m2(){

        System.out.println("inside m2 method of Parent class");
    }

    public void m3(){

        System.out.println("inside m3 method of Parent class");
    }

    public static void main(String[] args) {
        Demo obj= new Demo();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}