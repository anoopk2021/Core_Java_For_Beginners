package class_and_object;

public class BookMethodDay1 {

    // data member
    String book_name;
    int pages;
    String writer_name;

    //capabilities :  read , write

     /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */

    // Syntax : access_specifier return_type method_name (parameter ){ CODE }

    public void readMethod(){

        System.out.println("This is read Method");
    }

    public void writeMethod(){
        System.out.println("This is Write ... Method");
    }


    public static void main(String[] args) {
        // How to Call Method ?
        // STEP 1- create Object :  ClassName ObjName= new ClassName();

        BookMethodDay1 object= new BookMethodDay1();// creating Object

        // STEP 2 - object.methodName();
        object.readMethod();// Calling the ReadMethod

        object.writeMethod();// calling write method

    }
}