import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b; i++) {
            int n = sc.nextInt();
            int grade = n*100/a;
            
            if(grade >= 0 && grade <= 4) {
                System.out.print(1+" ");
            } else if(grade > 4 && grade <= 11) {
                System.out.print(2+" ");
            } else if(grade > 11 && grade <= 23) {
                System.out.print(3+" ");
            } else if(grade > 23 && grade <= 40) {
                System.out.print(4+" ");
            } else if(grade > 40 && grade <= 60) {
                System.out.print(5+" ");
            } else if(grade > 60 && grade <= 77) {
                System.out.print(6+" ");
            } else if(grade > 77 && grade <= 89) {
                System.out.print(7+" ");
            } else if(grade > 89 && grade <= 96) {
                System.out.print(8+" ");
            } else if(grade > 96 && grade <= 100) {
                System.out.print(9+" ");
            } 
        }
    }
    
}