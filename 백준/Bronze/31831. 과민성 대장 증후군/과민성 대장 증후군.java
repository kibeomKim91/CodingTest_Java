import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<n; i++) {
            sum += sc.nextInt();
            if(sum>=m) {
                count++;
            } else if(sum<0) {
                sum = 0;
            }
        }
        
        System.out.print(count);
    }
    
}