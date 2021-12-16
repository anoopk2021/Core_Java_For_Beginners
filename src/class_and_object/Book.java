package class_and_object;

public class Book {

    //Data Members
    String name="Java";
    int pages=500;
    int chapter=45;

    /*//capabilities or method or function
    public void read
    write*/

    public static void main(String [] args){

// SYNTAX : ClassName obj_name= new ClassName();

        Book object=new Book();// object created

        System.out.println("Printing Book Name "+object.name);
        System.out.println("Printing Book Name "+object.pages);
        System.out.println("Printing Book Name "+object.chapter);

        Book object1=new Book();// object1 created

        System.out.println("Printing Book Name "+object1.name);
        System.out.println("Printing Book Name "+object1.chapter);
        System.out.println("Printing Book Name "+object1.pages);

        Book object2=new Book();// object2 created
        System.out.println("Printing Book Name "+object2.name);
        System.out.println("Printing Book Name "+object2.chapter);
        System.out.println("Printing Book Name "+object2.pages);
    }

}