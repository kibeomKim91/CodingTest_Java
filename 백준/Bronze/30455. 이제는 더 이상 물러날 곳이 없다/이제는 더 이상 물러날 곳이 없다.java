import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 == 1) {
            System.out.print("Goose");
        } else {
            System.out.print("Duck");
        }
    }
    
}