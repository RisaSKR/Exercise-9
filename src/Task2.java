public class Task2 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[2] = 8/0;
            System.out.println(" First print of try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some other exception");
        }
        finally {
            System.out.println("Finally block has been run");
        }
    }
}
