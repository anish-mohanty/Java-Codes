import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class QA {

	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		try {
			FileInputStream fin=new FileInputStream("D://35/Java_Practice/src/Q_A.txt");
			System.out.println("Question: ");
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
			FileOutputStream fout=new FileOutputStream("D://35/Java_Practice/src/Q_A.txt");
			System.out.println("Ans(end with @): ");
			char ch;
			while((ch=(char)dis.read())!='@') {
				fout.write(ch);
			}
			fout.close();
		}
		catch(Exception e) {System.out.println(e);}

	}

}
