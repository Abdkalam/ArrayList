package sam.org;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class CollectionTypeList {

	public static void main(String[] args) {

		List li = new ArrayList();

		li.add(78);
		li.add("string");
		li.add(true);
		li.add(0123.2588744f);
		li.add('M');

		// System.out.println(li);

		int b = li.size();
		System.out.println(b);

		Object c = li.get(0); // object is including all format
		System.out.println(c);
		

		for (int i = 0; i < li.size(); i++) {
			Object loop = li.get(i);
			System.out.println(loop);
		}

		/*
		 * for(Object f:li) { System.out.println(f); }
		 */
	}
}
