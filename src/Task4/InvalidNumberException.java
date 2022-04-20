package Task4;

//1st exception
public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super("Invalid number. It should be between 1 and 10");
    }
    public InvalidNumberException(String message){
        super(message);
    }
}

//2nd exception
class StudentMarkException extends Exception{
    public StudentMarkException(){
        super("Passed. It should be more than 50");
    }
    public StudentMarkException(String message){
        super(message);
    }
}

//3rd exception
class GoldPriceException extends Exception{
    public GoldPriceException(){
        super("Market net price high. It should be more than 35,000 Baht ");
    }
    public GoldPriceException(String message){
        super(message);
    }
}
