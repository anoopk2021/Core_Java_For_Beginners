package collection_demo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // HashMap <DataType_Key,Datatype_value> objName= new hashMap();

        HashMap<Integer,String> hashMap=new HashMap<>();

        // adding elements in Hashmap

        hashMap.put(1,"Java");
        hashMap.put(2,"Spring ");
        hashMap.put(3,"Spring Boot");
        hashMap.put(4,"CLoud and Microservice");

        // get
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(1));

        // remove
        hashMap.remove(1);
        System.out.println(hashMap.get(1));

        for (Integer var:hashMap.keySet() ){

            System.out.println("Printing inside for Each Loop "+hashMap.get(var));
        }

    }
}