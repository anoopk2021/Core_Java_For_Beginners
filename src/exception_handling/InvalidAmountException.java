package exception_handling;

    public class InvalidAmountException extends Exception {

        InvalidAmountException(String message){

            super(message);
        }
    }