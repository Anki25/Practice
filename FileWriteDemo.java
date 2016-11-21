import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
	
	public void writeData() throws FileNotFoundException, IOException{
		/*try(FileOutputStream fout=new FileOutputStream("d:/test.txt")){ //can be given as d:\\test.txt
		//String str="hello";
		int bi;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		bi=sc.nextInt();
		fout.write(bi);
		}
		}
*/

		try(FileWriter fout=new FileWriter("d:/test.txt")){ //can be given as d:\\test.txt
			//String str="hello";
			String str;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any data");
			//str=sc.nextLine();
			str=sc.next();
			fout.write(str);
			}
			}

	public void readData() throws FileNotFoundException, IOException{
		try(FileReader fr=new FileReader("d:/test.txt")){
	       int i;
	       while((i=fr.read())!=-1){
	    	   char j=(char)i;
		       //System.err.print(j); prints in red as if it is an error
	    	   System.out.print(j); //without casting it will generate ASCII Codes of letters OR SYSOUT((CHAR)I)
	       }
		}
	}
	public static void main(String[] args) {
	FileWriteDemo f1=new FileWriteDemo();
	try {
		//f1.writeData();
		f1.readData();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}