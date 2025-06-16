package JavaAbstracts;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException{
        if(age<=18){
            try{
                throw new InvalidAgeException("Age is not valid to vote");
            } catch (InvalidAgeException e){
                throw new RuntimeException(e);
            }
        } else{
            System.out.println("Age is valid to vote");        }
    }
}
