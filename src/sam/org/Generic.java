package sam.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		List <Integer> li2=new LinkedList<Integer>();
		li.add(20);
		li.add(25);
		li.add(23);
		li.add(20);
		li.add(22);
		li2.add(70);
		li2.add(25);
		li2.add(55);
		li2.add(20);
		li2.add(45);
		System.out.println(li);
		Object get = li.get(2);
		System.out.println(get);
		System.out.println(li.size());
		li.add(2, 222);
		System.out.println(li);
		li.set(2, 111);
		System.out.println(li);
		int b = li.indexOf(20);
		System.out.println(b);
		int c = li.lastIndexOf(20);
		System.out.println(c);
		li.remove(2);
		System.out.println(li);
		boolean v = li.contains(30);
		System.out.println(v);
		boolean dd=li2.equals(li);
		System.out.println(dd);
		
		//li2.addAll(li);
		//System.out.println(li2);
		System.out.println(li);
		System.out.println(li2);
		li2.retainAll(li);
		System.out.println(li2);
		li2.add(19);
		System.out.println(li2);
		li2.removeAll(li);
		System.out.println(li2);
		
		for (int f: li);
		{
			System.out.println(li);
		}
		
		
		
		
		
		
	}

}
