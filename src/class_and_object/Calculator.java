package class_and_object;

public class Calculator {

    // add, subtract a-b, multi a*b, divide a/b

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public int addition(){

        int a=5;
        int b=3;
        int result= a+b;
        // System.out.println("Addition of a and b is : "+result);
        return result;
    }
    // Syntax : access_specifier return_type  method_name (parameter) {}
    public void subtration(){

        int a=5;
        int b=3;
        int result= a-b;

        System.out.println("Subtraction  of a and b is : "+result);
    }
    // Syntax : access_specifier return_type  method_name (parameter) {}
    public void multi(){

        int a=5;
        int b=3;
        int result= a*b;

        System.out.println("Multiplication   of a and b is : "+result);
    }
    // Syntax : access_specifier return_type  method_name (parameter) {}
    public void divide(){

        int a=5;
        int b=3;
        int result= a/b;

        System.out.println("divide   of a and b is : "+result);
    }

    public static void main(String[] args) {

        //Step 1
        Calculator obj= new Calculator();
        int result=obj.addition();
        System.out.println("Addition is :"+result);
        obj.subtration();
        obj.multi();
        obj.divide();

    }
}