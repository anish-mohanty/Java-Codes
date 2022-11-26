package demojava;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "anish";
		String reversedStr = "";
		
		for (int i =0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		
		}
		System.out.println("Reversed string: "+ reversedStr);		

	}

}
