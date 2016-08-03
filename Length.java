import java.util.Scanner;

public class Length extends CommonParent{
	private int feet,inch;
	public Length(){
		feet=inch=10;
			}
   public Length(int a,int b){
	   feet=a;
	   inch=b;
	   	   
}
   @Override
      public void input(){
	   Scanner sc=new Scanner(System.in);
	   feet=sc.nextInt();
	   inch=sc.nextInt();
	      }
   
   @Override
   public void display(){
	   
	   System.out.println(feet+ "-"+inch);
   }

}
