 package sam.org;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapList {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		Map<Integer, String> mp1 = new LinkedHashMap<>();
		Map<String, Integer> mp2 = new TreeMap<>();

		mp.put(0, "Abdul");
		mp.put(1, "Abdul");
		mp.put(2, "Kalam");
		mp.put(0, "RAffe");
		mp1.put(4, "Abdul");
		mp1.put(1, "Abdul");
		mp1.put(2, "Abdul");
		mp2.put("Ragge", 2);
		mp2.put("Yke", 1);
		mp2.put("Abdu", 0);
		System.out.println(mp);
		System.out.println(mp1);
		System.out.println(mp2);
		System.out.println(mp.size());
		

		Set<Integer> a = mp.keySet();
		System.out.println(a);
		for (Integer f : a) {
			System.out.println(f);
		}
		Collection<String> c = mp.values();
		System.out.println(c);
		for (String g : c) {
			System.out.println(g);
		}
Set <Entry<Integer,String>> z= mp.entrySet();
System.out.println(z);
for (Entry <Integer,String> y: z)
{
	System.out.println(y.getKey());
	System.out.println(y.getValue());
}

	}
}
