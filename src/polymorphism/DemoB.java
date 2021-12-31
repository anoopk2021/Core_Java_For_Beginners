package polymorphism;

public class DemoB extends DemoA{

    // redefining parent class method and overriding will be happen in child class only

    @Override
    public void m1(){
        System.out.println("This is m1 method of DemoB Child Class");
    }

    public static void main(String[] args) {

        DemoB obj= new DemoB();
        // obj.m1();
        // Runtime Polymorphism

        DemoA parentObj= new DemoB();
        parentObj.m1();
        //new DemoB();

       /* DemoB child=new DemoA();
        child.m1();*/
    }
}