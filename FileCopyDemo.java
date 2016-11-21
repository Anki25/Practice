import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileCopyDemo {
	//reads from a file and writes into another file
	
	public static void copyFile() {//using normal try block
			try{
				FileInputStream fin=new FileInputStream("d:\\test.txt");
				FileOutputStream fout=new FileOutputStream("e:\\test2.txt");
				FileInputStream fin1=new FileInputStream("e:\\test2.txt");
		       int i;
		       while((i=fin.read())!=-1){
		    	   fout.write(i);
		       }
			int j;
			while((j=fin1.read())!=-1){
		    	   System.out.print((char)j);
		       }}
			catch(IOException ex){
		    	   System.out.println("Could not copy");
		       }
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
copyFile();
	}

}
