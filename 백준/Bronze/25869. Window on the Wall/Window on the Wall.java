import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt() * 2;
        
        if(a-c <= 0 || b-c <= 0) {
            System.out.print(0);
            return;
        }
        
        System.out.print((a-c)*(b-c));
    }
    
}