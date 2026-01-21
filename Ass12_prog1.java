package com.index;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ass12_prog1 {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		
		Iterator<Integer> itr = st.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}	
	}
}
