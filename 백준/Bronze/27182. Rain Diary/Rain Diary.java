import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a >= 8) {
            System.out.print(a-7);
        } else {
            System.out.print(b+7);
        }
    }
    
}