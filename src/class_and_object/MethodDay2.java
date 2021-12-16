package class_and_object;

public class MethodDay2 {


    // Syntax : access_specifier return_type  method_name (parameter) {}

    public int m1(){

        System.out.println("This is m1 Method");

        return 33;
    }

    public int m3(){

        int age=25;

        return age;
    }

    public String m2(){

        System.out.println("This is m2 Method");

        return "Java";
    }
    public String m4(){

        String course="Java Microservice Developer";

        return course;
    }


    public static void main(String[] args) {

        MethodDay2 obj= new MethodDay2();

        int output=obj.m1();

        System.out.println("m1 method's output is "+output);

        String var=obj.m2();

        System.out.println("m2 method's output is "+var);

        int age=obj.m3();
        System.out.println("Age : "+age);

        String course =obj.m4();
        System.out.println("Our Course is: "+course);

    }


}