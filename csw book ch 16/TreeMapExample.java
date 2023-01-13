package test1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();
		 trmap.put(1, "tree 1");
		 trmap.put(17, "tree 2");
		 trmap.put(50, "tree 3");
		 trmap.put(7, "tree 4");
		 trmap.put(3, "tree 5");
		 Set set = trmap.entrySet();
		 Iterator iterator1 = set.iterator();
		 while (iterator1.hasNext()) {
		 Map.Entry ment = (Map.Entry) iterator1.next();
		 System.out.print("key is: " + ment.getKey() + " and Value is: ");
		 System.out.println(ment.getValue());
		 }
		 }
		

	}


