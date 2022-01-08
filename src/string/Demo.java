package string;

public class Demo {

    public static void main(String[] args) {

        String s="Java";
        String s1="Java";
        String s2= new String("Java");
        String s3= new String ("Java");

        if(s==s1){

            System.out.println("s and s1 are at same memory location");
        }

        if(s==s2){
            System.out.println("s and s2 are at same memory location");
        }
        else {
            System.out.println("NO ,s and s2 are not at same memory location");
        }

        if (s2==s3){
            System.out.println("s2 and s3 are at same memory location");
        }


        if (s.equals(s1)){

            System.out.println("s and s1 holding same data");
        }
        if (s1.equals(s2)){

            System.out.println("s1 and s2 holding same data");
        }
        if (s2.equals(s3)){

            System.out.println("s2 and s3 holding same data");
        }
    }
}