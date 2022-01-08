package important_concepts;


public class Child extends  StaticDemo {


    public static void message(){

        System.out.println("Hello Java from Child ");
    }

    public static void main(String[] args) {

        Child.message();
    }
}