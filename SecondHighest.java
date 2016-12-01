package practice;

import java.util.Scanner;

public class SecondHighest{

int high,second;
int[] a=new int[5];
Scanner sc=new Scanner(System.in);

public void findSecond(){

System.out.println("Enter elements of array");

for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}

high=a[0];

for(int j=1;j<a.length;j++){
if(a[j]>high){
high=a[j];
}
}
System.out.println("Highest no."+ high);

second=a[0];
for(int j=1;j<a.length;j++){
if(a[j]>second){
	if(a[j]<high)
second=a[j];
}
}
System.out.println("Second Highest no."+ second);

}

public static void main(String[] args){

	SecondHighest sh=new SecondHighest();

	sh.findSecond();
}

}


