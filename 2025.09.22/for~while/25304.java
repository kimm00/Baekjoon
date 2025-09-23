import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        
        int total = 0;
        for(int i=1; i<=N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            total = total + a*b;
        }
        if(X==total){
            System.out.println("Yes");
        } 
        if(X!=total){
            System.out.println("No");
        }
        
    }
}