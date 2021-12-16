package conditional_statements;

public class If_Else {

    // SYNTAX : if(condition){COOE}
    //          else{  }


    public static void main(String[] args) {

        // SYNTAX : if(condition){COOE}
        //          else{  }

        int age = 27;

        if (age > 18) {
            System.out.println("Eligible for Job ....");
        } else {
            System.out.println("NOT Eligible for Job ....");
        }

        String city = "Tundla";

        if (city == "Tundla") {
            System.out.println("Person Home Town is Tundla");
        } else {
            System.out.println("Person Home Town not  Belongs to Tundla");
        }

        // AND Operator
        if (age > 18 && city == "AGRA") {

            System.out.println("Person is eligible for Voting in AGRA ");
        } else {
            System.out.println("Person is NOT eligible for Voting in AGRA ");
        }

        // OR Operator
        age = 17;
        if (age > 18 || city == "AGRA") {
            System.out.println("Person is eligible for Voting in AGRA ");
        } else {
            System.out.println("Person is eligible for Voting in AGRA ");
        }
    }
}