package exception_handling;

public class InvalidAgeException extends Exception  {

    InvalidAgeException(String message){
        super(message);
    }
}