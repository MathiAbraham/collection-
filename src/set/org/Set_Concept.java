package set.org;

import java.util.HashSet;
import java.util.Set;

public class Set_Concept {
	
	
	public static void main(String[] args) {
		
	Set<Integer> s = new HashSet<Integer>();	
		
	//add
	
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	System.out.println(s);
	
	Set<Integer> s1 = new HashSet<Integer>();
	s1.add(100);
	s1.add(200);
	s1.add(300);
	s1.add(400);
	System.out.println(s1);
	
	
	//addAll
	
	s.addAll(s1);
	System.out.println(s);
	
	//size
	int size = s.size();
	System.out.println("size:"+size);
	
	//contains
	boolean contains = s.contains(30);
	System.out.println("contains:"+contains);
	
	boolean contains2 = s.contains(500);
	System.out.println("contains2:"+contains2);
	
	//equals
	s.equals(s1);
	System.out.println(s);
	
//remove
	
	s.remove(400);
	System.out.println(s);
	

	//retainAll
	
			s.retainAll(s1);
			System.out.println(s);
	
	
	//clear
	
	s.clear();
	System.out.println(s);
	

	//removeAll
	
	s.removeAll(s1);
	System.out.println(s);
	
	
	
	
		
	}
	

}
