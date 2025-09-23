import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int d = N/4;
        
        for(int i=1; i<=d; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}