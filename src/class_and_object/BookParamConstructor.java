package class_and_object;

public class BookParamConstructor {

    //Data Members
    String name;
    int pages;
    int chapter;


    // parameterized constructor
    public BookParamConstructor(String name, int pages, int chapter) {
        this.name = name;
        this.pages = pages;
        this.chapter = chapter;
    }

    public static void main(String[] args) {

        // SYNTAX : ClassName obj_name= new ClassName(parameters or data members);

        BookParamConstructor object1= new BookParamConstructor("Java",400,45);


        System.out.println("Printing Book Name "+object1.name);
        System.out.println("Printing Book Name "+object1.chapter);
        System.out.println("Printing Book Name "+object1.pages);

        BookParamConstructor object2= new BookParamConstructor("Spring",500,30);
        System.out.println("Printing Book Name "+object2.name);
        System.out.println("Printing Book Name "+object2.chapter);
        System.out.println("Printing Book Name "+object2.pages);

        BookParamConstructor object3= new BookParamConstructor("SpringBoot",200,20);
        System.out.println("Printing Book Name "+object3.name);
        System.out.println("Printing Book Name "+object3.chapter);
        System.out.println("Printing Book Name "+object3.pages);
    }


}