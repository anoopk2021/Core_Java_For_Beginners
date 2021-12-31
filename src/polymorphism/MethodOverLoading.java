package polymorphism;

public class MethodOverLoading {

    // same method with different parameters

    public void m1(){
        System.out.println("This is m1 method");
    }
    //overload m1

    public void m1(int a){

        System.out.println("This is m1 overloaded method with int");
    }

    //overload m1
    public void m1(String s){

        System.out.println("This is m1 overloaded method with String");
    }
    //overload m1
    public void m1(String s,int a){

        System.out.println("This is m1 overloaded method with String and int");
    }


    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.m1();
        obj.m1(33);
        obj.m1("Test");
        obj.m1("Java",33);
    }
}