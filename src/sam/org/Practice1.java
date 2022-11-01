package sam.org;
import java.util.ArrayList;
import java.util.List;
public class Practice1 {
	
	public static void main(String[] args) {
		List li=new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(null);
		System.out.println(li);
		int i = li.indexOf(20);
		System.out.println(i);
		int e=li.lastIndexOf(50);
		System.out.println(e);
		
		System.out.println(li.get(2));
		boolean c=li.contains(50);
		System.out.println(c);
		li.add(2,30);
		System.out.println(li);
		li.set(5,60);
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
		
	}

}
