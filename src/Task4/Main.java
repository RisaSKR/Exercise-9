package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number between 1 to 10: ");
            int num = scan.nextInt();
            if (num <= 10) {
                throw new InvalidNumberException();
            }

            System.out.println("Enter Your Student mark: ");
            int mark = scan.nextInt();
            if (mark >= 50) {
                throw new StudentMarkException();
            }

            System.out.println("Enter a Gold price in baht: ");
            int price = scan.nextInt();
            if(price >= 35000){
                throw new GoldPriceException();
            }
        }
        catch (InvalidNumberException | StudentMarkException | GoldPriceException e){
            System.out.println(e.getMessage());
        }
    }

}
