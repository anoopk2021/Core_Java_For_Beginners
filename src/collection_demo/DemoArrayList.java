package collection_demo;

import java.util.ArrayList;

    public class DemoArrayList {

        public void demo(){
            // CollectionName  objName= new CollectionName();

            ArrayList arrayList= new ArrayList();

            // add ,

            arrayList.add("Java");// 0 index
            arrayList.add("Spring");// 1 index
            arrayList.add("Spring Boot");//2 index
            arrayList.add("Cloud");// 3 index
            arrayList.add(23);
            arrayList.add(345.5);

            //get-- read

            System.out.println("Printing 3rd index " +arrayList.get(2));
            System.out.println("Printing 1st index " +arrayList.get(0));
            System.out.println("Printing 2nd index " +arrayList.get(1));

            // advanced for (Datatype var : array/collection){}

            for (Object var:arrayList){
                System.out.println("Printing arrayList "+var);

            }

            // remove
            arrayList.remove(0);

            System.out.println("Printing size of arrayList "+arrayList.size());
            for (Object var:arrayList){
                System.out.println("After delete Printing arrayList "+var);
            }


        }

        public static void main(String[] args) {

            collection_demo.DemoArrayList obj= new collection_demo.DemoArrayList();
            obj.demo();
        }
    }

