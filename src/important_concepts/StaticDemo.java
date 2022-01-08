package important_concepts;

public class StaticDemo {
    //Static it can be called using Class name only , without creating object
    // we can not use non static data inside static methods
    // we can not override static method because it does not make any sense
    // it always follows compile time binding

    public static String name="Java";
    int age=33;

    public static void message(){

        System.out.println("Hello Java ");
    }

    public static void main(String[] args) {

        System.out.println(StaticDemo.name);

        StaticDemo.message();
    }
}