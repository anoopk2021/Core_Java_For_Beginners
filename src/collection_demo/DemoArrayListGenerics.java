package collection_demo;

import java.util.ArrayList;

public class DemoArrayListGenerics {


    public static void main(String[] args) {

        // CollectionName  objName= new CollectionName();
        // SYNTAX GENERICS : // CollectionName<DataType>  objName= new CollectionName();

        ArrayList<String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring Boot");
        stringArrayList.add("CLoud and MS");

        for (int i=0; i<stringArrayList.size(); i++){

            System.out.println("Printing stringArrayList: "+stringArrayList.get(i));
        }

        ArrayList<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(33);
    }
}
