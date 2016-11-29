package practice;

import java.util.Scanner;

public class HcfLcm {
	
	public static void main(String args[])
    {
        int a, b, x, y, t, hcf, lcm;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        x = scan.nextInt();
        y = scan.nextInt();
		
        a = x;
        b = y;
		
        while(b != 0)
        {
            t = b;
            System.out.println("t= "+ t);
             b = a%b;
             System.out.println("b= "+ b);
            a = t;
            System.out.println("a= "+ a);
        }
		
        hcf = a;
        lcm = (x*y)/hcf;
		
        System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
    }

}
