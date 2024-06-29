package basic.comcollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Remove_Duplicate_Values_HashMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Amit");
		map.put(2, "Kumar");
		map.put(3, "Amit");
		map.put(5, "Wipro");
		map.put(4, "Amit");
		
		Collection<String> list = map.values();
		for(Iterator<String> it = list.iterator(); it.hasNext();) {
			if(Collections.frequency(list, it.next()) > 1) {
				it.remove();
				System.out.println(list);
			}
		}

	}

}
