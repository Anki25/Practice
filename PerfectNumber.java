package practice;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void findPerfect(){
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(int i=1;i<num;i++){
			if (num%i==0){
				sum+=i;
			}
		}
		if(sum==num){
			System.out.println(num + " is a perfect number");
		}else{
			System.out.println(num + " is NOT a perfect number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPerfect();

	}

}
