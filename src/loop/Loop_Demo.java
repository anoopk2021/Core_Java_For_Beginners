package loop;

public class Loop_Demo {

    public static void main(String[] args) {

        //SYNTAX : for(initilization ;    condition;  increment/decrement){
        ////               code to be executed
        //             }
// increment
        for (int i=0; i<5; i++) {//0,1,2,3,4,5
            System.out.println("Hello Java "+i);
        }

//decrement
        for (int i=5; i>0; i--)  {

            System.out.println("Decrement Loop Hello Java "+i);
        }
// while loop

// SYNTAX: while(condition){
////           code to be executed
        // increment/decrement
//              }

        int j=0;
        while (j<5){
            System.out.println("Inside while loop "+j);
            j++;
        }
        j=5;
        while (j>0){
            System.out.println("Inside Decrement while loop "+j);
            j--;

        }
// DO WHILE LOOP

       /* do {
            CODE
            incr/decr
             }
          while (Condition);*/
        j=0;
        do {
            System.out.println("Do while Loop "+j);
            j++;
        }
        while (j<5);

        j=10;
        do{
            System.out.println("Decrement Do while Loop "+j);
            j--;
        }
        while(j>0);
    }
}