package sam.org;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetType {
	public static void main(String[] args) {
		Set <Integer> s= new HashSet<Integer>(); //random order
		Set <Integer> s1= new TreeSet<Integer>(); //ascending order
		Set <Integer> s2=new LinkedHashSet<Integer>(); //insertion order
		s.add(21);
		s.add(20);
		s.add(19);
		s1.add(22);
		s1.add(20);
		s1.add(19);
		s2.add(21);
		s2.add(20);
		s2.add(19);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.size());
		s.addAll(s1);
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		for (int a:s1) 
		{
			System.out.println(s1);
	}
		
		
	}

}
