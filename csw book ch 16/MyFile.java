import java.io.DataInputStream;
import java.io.FileOutputStream;

public class MyFile {

	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		try {
			FileOutputStream fout=new FileOutputStream("D://35/Java_Practice/src/MyFile.txt");
			
			System.out.println("Enter text(@ at the end)");
			char ch;
			while((ch=(char)dis.read())!='@') {
				fout.write(ch);
			}
			fout.close();
		}
		catch(Exception e) {System.out.println(e);}

	}

}
