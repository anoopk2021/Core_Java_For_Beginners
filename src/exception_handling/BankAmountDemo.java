package exception_handling;

public class BankAmountDemo {

    public static void main(String[] args) {

        int amount =6000;

        if (amount>5000){
            System.out.println("Welcome to Account Open Application");
        }
        else {
            try {
                throw new InvalidAmountException("Amount is less than 5000 ");
            } catch (InvalidAmountException e) {
                e.printStackTrace();
            }
        }

    }
}