import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        
        for(int i=0; i<n; i++) {
            num *= 2;
        }
        
        System.out.print(num);
    }
    
}