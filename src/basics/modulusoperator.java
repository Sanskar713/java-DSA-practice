package basics;

import java.util.Scanner;

public class modulusoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the divisor :");
        int m=sc.nextInt();
        System.out.print("enter the dividend :");
        int n=sc.nextInt();
        System.out.println(m%n);
    }
}
