package basic.comcollection;

import java.util.HashMap;
import java.util.Map;

public class Map_Print {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Amit");
		map.put(2, "Kumar");
		map.put(3, "Amit");
		
		System.out.println(map.get(2));  // Kumar
		System.out.println(map.values());  // Amit Kumar Amit
		System.out.println(map.remove(3)); //Amit
		
		

	}

}
