package testNgPack;

import java.util.ArrayList;
import java.util.List;

public class TestClass2 {

	public static void main(String[] args) {
		
		
		// Insertion 
		// Retrieval 
		// Deletion
		
		
		// Heterogeneous collection
		
//		ArrayList a = new ArrayList ();
//		
//		a.add("Mayur");
//		a.add(247);
//		a.add(5.258);
//		a.add('@');
//		
//		
//		for  (int i=0; i<a.size(); i++)
//		{
//			System.out.println(a.get(i));
//			
//			//a.get(3);
//		}
//		
		System.out.println("===============================================");
		
		//Homogeneous collection
		
		ArrayList<String> b = new ArrayList<String>();
		
		
		b.add("Amit");
		b.add("Batch");
		b.add("Pune");
		
		for (int i=0; i< b.size(); i++)
		{
			System.out.println(b.get(i));
		}
		
		//Deletion
		b.remove(2);
		
		System.out.println("======================================");
		
		for (int i=0; i<b.size(); i++)
		{
			
			//Retrieval
			System.out.println(b.get(i));
			
		}
		
		//Advance for loop 
		
		for (String s : b)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
