package collection_demo;


import java.util.HashSet;
import model.StudentModel;

public class SetWithStudent {

    public static void main(String[] args) {

        HashSet <StudentModel> studentHashSet= new HashSet<>();

        // Create student objects

        // we need student objects
        StudentModel student1 = new StudentModel("Rahul",24,"IT",2);
        StudentModel student2 = new StudentModel("Ramesh",22,"CS",1);
        StudentModel student3 = new StudentModel("Rahul",24,"IT",2);
        StudentModel student4 = new StudentModel("Aditi",24,"IT",1);

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for (StudentModel var: studentHashSet){

            System.out.println("Printing set :"+var.getName());
        }


    }
}
