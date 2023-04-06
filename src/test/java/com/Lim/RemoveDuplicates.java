package com.Lim;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="adassgree";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
				else {
					map.put(ch, 1);
				
		}
	
		

	}
		System.out.println(map);

}
}
