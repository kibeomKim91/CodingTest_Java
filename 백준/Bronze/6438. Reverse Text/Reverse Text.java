import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            int strLength = str.length();
            
            for(int j=strLength-1; j>=0; j--) {
                System.out.print(str.charAt(j));
            }
            
            System.out.println("");
        }
    }
    
}