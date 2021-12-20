package scanner;

import java.util.Scanner;

public class ScannerInput {


        public static void main(String[] args) {

            // SYNTAX: ClassName objName= new ClassName();

            // Scanner obj= new Scanner(System.in); // create object of scanner class

            Scanner obj =new Scanner(System.in);

            System.out.println("Please Enter your name ");

            String name=obj.nextLine();// it always read String input

            System.out.println("You have entered : "+name);

            System.out.println("Please Enter your age ");

            int age= obj.nextInt(); // reads integer value

            System.out.println("Age entered is: "+age);

            System.out.println("Please Enter your Salary ");
            double salary= obj.nextDouble();

            System.out.println("Salary entered is: "+salary);

        }
    }

