package class_and_object;

public class CalculatorWithReturn {
    // add, subtract a-b, multi a*b, divide a/b
    // Syntax : access_specifier return_type  method_name (parameter) {}

    public int addition(){
        int a=5;
        int b=3;
        int result= a+b;
        return result;
    }
    public int subtration(){
        int a=8;
        int b=3;
        int subtraction_value= a-b;
        return subtraction_value;
    }
    public int multipication() {
        int a = 23;
        int b = 2;
        int multipication_value = a * b;
        return multipication_value;
    }
    public int division() {
        int a = 20;
        int b = 2;
        int division_value = a / b;
        return division_value;
    }

    public static void main(String[] args){
            CalculatorWithReturn obj = new CalculatorWithReturn();

            int result = obj.addition();
            System.out.println("Addition is :" + result);

            int subtraction_value = obj.subtration();
            System.out.println("Subtraction is :" + subtraction_value);

            int multipication_value = obj.multipication();
            System.out.println("Multipication is :" + multipication_value);

            int division_value = obj.division();
            System.out.println("Division is :" + division_value);
        }
    }
