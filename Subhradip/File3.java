
import java.io.DataInputStream;
import java.io.FileInputStream;


public class File3 {

	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		try {
			FileInputStream fin=new FileInputStream("D://35/Java_Practice/src/MyFile.txt");
			System.out.println("File content: ");
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(Exception e) {System.out.println(e);}

	}

}
