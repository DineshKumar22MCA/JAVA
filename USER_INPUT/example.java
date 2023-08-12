package USER_INPUT;

import java.util.Scanner;

public class example {
    public static void main(String args[])
    {
        //a2+b2+2ab
        Scanner scan =new Scanner(System.in);
        //int a,b,c;
        float a,b,c;
        System.out.println("Enter 2 Nos : ");
        //a=in.nextInt();
       // b=in.nextInt();
        a=scan.nextFloat();
        b=scan.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result : "+c);
 
    }
}
/*
in.nextInt();
in.nextFloat();
in.nextDouble();
in.next();
in.nextLine();
 */

