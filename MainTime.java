import java.util.ArrayList;
public class MainTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Time t1=new Time();
       Time t2=new Time(10,5,10);
       Time t3=new Time1();
       
       t1.display();
       t2.display(); */
       
		ArrayList<CommonParent> data=new ArrayList();
	       data.add(new Length(154,45));
	       data.add(new Time1(14,25,89));
	       data.add(new Length(89,3));
	       data.add(new Time1(23,3,1));
	       data.add(new Length(70,66));
	       
	       for(CommonParent temp : data)
	  	   temp.display();
       
	}
/* for(Time1 temp : data){ temp.display(); }
  */
	}
