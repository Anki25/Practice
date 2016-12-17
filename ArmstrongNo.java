package practice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void isArmstrong(){
		int num,r,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		while(num>0){
				r=num%10;
				sum=sum+r*r*r;
				num=num/10;
			}
		if(sum==temp){
			System.out.println(temp+" is an armstrong no.");
		}else{
			System.out.println(temp+" is NOT an armstrong no.");
		}
	}
	
	public static void main(String[] args) {
		isArmstrong();
		
	}
}
