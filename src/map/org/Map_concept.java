package map.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_concept {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(100, "hundred");
		m.put(200, "twohundred");
		m.put(300, "threehundred");
		m.put(400, "fourhundred");
		
		System.out.println(m);
		
		//size
		int size = m.size();
		System.out.println(size);
		
		//get
		
		String string = m.get(200);
		System.out.println(string);
		
		//get
		
		System.out.println(m.get("fourhundred"));
		
		//keyset
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//values
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		//containskey
		
		boolean containsKey = m.containsKey("400");
		System.out.println(containsKey);
		
		//containsvalue
		
		boolean containsValue = m.containsValue("hundread");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
	
	
}
