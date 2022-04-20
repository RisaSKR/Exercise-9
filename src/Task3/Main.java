package Task3;

public class Main {
    public static void main(String[] args) throws NotEnoughMoney {
        int withdraw = 200, balance = 10000;
        Account a = new Account("Sirisa",balance,"ABC");
        try{
            if(balance >= withdraw)
                a.Cal(withdraw);
            else
                throw new NotEnoughMoney();
        }
        catch (NotEnoughMoney e){
            System.out.println(e.getMessage());
        }
        finally {
            a.Cal(withdraw);
        }


    }
}
