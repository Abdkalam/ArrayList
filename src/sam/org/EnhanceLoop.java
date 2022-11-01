package sam.org;

public class EnhanceLoop { 
	public static void main(String[] args) {
		//syntax datatype ref[]= new datatype[size]
		//Accepting Duplicate Values
		//in size mentioned any duplicate, its take last value and put 0 for empty size
		int a[]=new int[5];
		a[0]=10;
		a[0]=10;
		a[1]=55;
		//a[5]=456; if put greater than limit you got error msg limit 5-->0 to 4
		a[1]=45;
		a[1]=10;
		
		System.out.println(a[4]);
		System.out.println(a[0]);
		System.out.println(a.length); // for length
		
		for (int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
//		for (int f:a)
//		{
//			System.out.println(f);
//		}
		
		
		
	}

}
