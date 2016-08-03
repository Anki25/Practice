import java.util.Scanner;

public class Time1 extends CommonParent{
	private int hours,min,sec;
	public Time1(){
		hours=min=sec=5;
			}
   public Time1(int a,int b,int c){
	   hours=a;
	   min=b;
	   sec=c;
	   
}
   @Override
   public void input(){
	   Scanner sc=new Scanner(System.in);
	   hours=sc.nextInt();
	   min=sc.nextInt();
	   sec=sc.nextInt();
	   
   }
   
   @Override
   public void display(){
	   while(sec>60){
		   min++;
		   sec -= 60;
	   }
	   while(min>60){
		   hours++;
		   min -= 60;
	   }
	   System.out.println(hours+ ":"+min+":"+sec);
   }
   
  /* public Time1 add(Time1 lt,Time1 rt){
	   Time1 temp=new Time1();
	   temp.hours=lt.hours+rt.hours;
	   temp.min=lt.min+rt.min;
	   temp.sec=lt.sec+rt.sec;
	   return temp;
	   
   } */
   
   
}
