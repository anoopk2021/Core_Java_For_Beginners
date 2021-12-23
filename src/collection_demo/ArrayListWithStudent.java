package collection_demo;

import model.Student;

import java.util.ArrayList;

public class ArrayListWithStudent {

    public static void main(String[] args) {

        // SYNTAX GENERICS : // CollectionName<DataType>  objName= new CollectionName();


        ArrayList <Student> studentArrayList= new ArrayList<>();

        // we need student objects
        Student student1 = new Student("Rahul",24,"IT");
        Student student2 = new Student("Ramesh",22,"CS");
        Student student3 = new Student("Mohit",24,"IT");
        Student student4 = new Student("Aditi",24,"IT");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        for (Student var:studentArrayList ){

            System.out.println("Printing name: "+var.getName());
            System.out.println("Printing Age: "+var.getAge());
            System.out.println("Printing Branch: "+var.getBranch());
        }
    }
}
