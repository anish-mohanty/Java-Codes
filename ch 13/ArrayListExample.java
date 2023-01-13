package test1;
import java.util.*;
import java.io.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10000000;
		 
		 ArrayList<Integer> arrlist = new ArrayList<Integer>(size);

		 for (int i = 1; i <= size; i++) {
		 arrlist.add(i);
		 }
		 System.out.println(arrlist);
		 arrlist.remove(2);
		 
		 System.out.println(arrlist);
		 }
		

	}

