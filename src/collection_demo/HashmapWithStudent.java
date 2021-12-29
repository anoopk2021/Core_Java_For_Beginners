package collection_demo;

import model.Student;
import java.util.ArrayList;
import java.util.HashMap;

public class HashmapWithStudent {

    public void demo(){

        HashMap<Integer, Student> studentHashMap= new HashMap<>();

        // we need student objects
        Student student1 = new Student("Rahul",24,"IT");
        Student student2 = new Student("Ramesh",22,"CS");
        Student student3 = new Student("Mohit",24,"IT");
        Student student4 = new Student("Aditi",24,"IT");

        //adding to map

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);
        studentHashMap.put(4,student4);

        // traverse

        for (Integer var: studentHashMap.keySet()){

            System.out.println("Printing Student hashMap : " +studentHashMap.get(var).getName());
            System.out.println("Printing Student hashMap : " +studentHashMap.get(var).getAge());
            System.out.println("Printing Student hashMap : " +studentHashMap.get(var).getBranch());

        }

    }

    public void demoList(){


        HashMap<String, ArrayList<Student>> stringArrayListHashMap= new HashMap<>();
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

        stringArrayListHashMap.put("FIRST",studentArrayList);

        stringArrayListHashMap.get("FIRST");

    }



    public static void main(String[] args) {

        HashmapWithStudent obj= new HashmapWithStudent();
        obj.demo();
    }


}