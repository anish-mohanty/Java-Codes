import java.util.Scanner;

public class PQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the length of array "+(i+1));
			int n=sc.nextInt();
			arr[i]=new int[n];
			System.out.println("Enter the elements");
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
