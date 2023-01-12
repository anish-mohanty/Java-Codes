import java.io.DataInputStream;
import java.io.FileInputStream;

public class WAJP1 {

	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		try {
			FileInputStream fin=new FileInputStream("D://35/Java_Practice/src/MyFile.txt");
			System.out.println("File content: ");
			int c,ch=0,w=0,l=0;
			while((c=fin.read())!=-1) {
				ch++;
				if(!((c>64&&c<90)&&(c>96&&c<123))){
					w++;
				}
				if(c==46) {
					l++;
				}
			}
			fin.close();
		}
		catch(Exception e) {System.out.println(e);}

	}

}
