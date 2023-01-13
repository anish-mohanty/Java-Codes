package test1;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Linkedhashedmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lihamap = new LinkedHashMap<Integer, String>();
		 
		 lihamap.put(31, "Anish");
		 lihamap.put(45, "Mithi");
		 lihamap.put(12, "Virat");
		 lihamap.put(14, "Rahul");
		 lihamap.put(200, "Swayams");
		
		 Set set1 = lihamap.entrySet();
		
		 Iterator iter1 = set1.iterator();
		 while (iter1.hasNext()) {
		 Map.Entry me = (Map.Entry) iter1.next();
		 System.out.print("The key is: " + me.getKey() + " and Value is: " + me.getValue() + "\n");
		 
	
		 }
		 }
		
	}


