import java.util.Scanner;

public class exponentialNumber {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number for exponential counting:");
        int N=scan.nextInt();
        System.out.println("enter the power of number:");
        int p=scan.nextInt();
        int result=1;
        for (int i=1; i<=p; i++){
            result*=N;
        }System.out.println("number: "+N+" and "+"power: "+p+" result is:" +result);
    }
}


