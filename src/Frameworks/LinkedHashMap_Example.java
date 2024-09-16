package Frameworks;

import java.util.LinkedHashMap;

public class LinkedHashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap lhm = new LinkedHashMap();
         lhm.put("A",10);
         lhm.put("B",20);
         lhm.put("C",30);
         lhm.put("D",40);
         lhm.put("A",50);
         lhm.put("E",50);
         System.out.println(lhm);
	}

}
