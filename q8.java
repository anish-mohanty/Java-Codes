package demojava;

public class q8 {

	public static void main(String[] args) {
		String s = new String("Hi I am lmao ded");
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u') {
				System.out.println("String contains "+s.charAt(i)      + " at " +i);
			}
		}

	}

}
