package demojava;

public class q9 {

	public static void main(String[] args) {
		
		int x,y=0,s=0;
		int z=3;
		y=z/2;
		if(z==0||z==1) {
			System.out.println(z+"is not prime number");
		}else {
			for(x=2;x<y;x++) {
				if (y%x==0) {
					System.out.println(z+"is not prime number");
					s=1;
					break;
					
				}
			}
			if (s==0) {
				System.out.println(z+" is prime number");
				
			}
		}

	}

}
