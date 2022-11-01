package sam.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	
	public static void main (String args[]) {
		
		Map  v = new HashMap ();
		
		v.put(2,"add");
		v.put(5,"deeee");
		
//		Set keySet = v.keySet();
//		
//		for (Object o : keySet) {
//			
//			System.out.println(o);
//			
//		}
		Collection <String> g = v.values();
		
		
		for (String e : g) {
			System.out.println(e);
		}
		
		Set <Entry<Integer,String>> d = v.entrySet();
		for (Entry<Integer, String> a : d) {
			
		
			
		}
		
		
		
		
	}

}
