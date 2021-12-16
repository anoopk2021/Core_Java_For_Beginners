package loop;

public class Factorial {

    public static void main(String[] args) {

        int number=4;

        int fact=1;

        for (int i=number; i>0;i--){

            fact=fact*i;
        }

        System.out.println("Factorial of given "+number + " is "+fact);
    }
}