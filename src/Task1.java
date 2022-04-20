public class Task1 {
    public static void main(String[] args) {

        String s = null;
        System.out.println( s.toString() );

        int num1, num2;
        try{
            num1 = 0;
            num2 = 5;
            System.out.println(num2);
            System.out.println(" End of try block");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }



    }
}
