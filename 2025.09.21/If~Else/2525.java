import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        B += C;
        A += B/60;
        B = B % 60;
        A = A % 24;
        
        System.out.println(A + " " + B);
    }
}