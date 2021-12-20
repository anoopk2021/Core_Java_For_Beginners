package arrays;

    public class Demo {

        public void demoArray(){

            // SYNTAX of  Array : DataType [] variable_name={,,,};

            String [] nameArray={"Raj","Rakesh","Mukesh","Amit","John"};

            // indexing 0,1,2,3,.....

            System.out.println("Printing Array elements "+nameArray[0]);
            System.out.println("Printing Array elements "+nameArray[1]);
            System.out.println("Printing Array elements "+nameArray[2]);
            System.out.println("Printing Array elements "+nameArray[3]);
            System.out.println("Printing Array elements "+nameArray[4]);

            for (int i=0; i<nameArray.length; i++){

                System.out.println("Inside for loop "+nameArray[i]);
            }

            // advanced for Loop SYNTAX for (DataType var_name: array/Collection) { CODE }

            for (String var: nameArray){

                System.out.println("Advanced for Loop "+var);
            }

            int [] marks={45,65,78,23,45,76,87,21};

            System.out.println("Printing marks Array elements "+marks[0]);
            System.out.println("Printing marks Array elements "+marks[1]);
            System.out.println("Printing marks Array elements "+marks[2]);
            System.out.println("Printing marks Array elements "+marks[3]);
            System.out.println("Printing marks  Array elements "+marks[4]);

            for (int var: marks){

                System.out.println("Printing marks using advanced loop "+var);
            }

        }

        public static void main(String[] args) {
            arrays.Demo obj=new arrays.Demo();
            obj.demoArray();
        }
    }



