import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check integer or not");
        boolean bool=sc.hasNextInt();
        System.out.println(bool);
    }
}
