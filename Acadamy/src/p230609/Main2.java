package p230609;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("iBATIS");
		set.add("JDBC");
		set.add("Java");
		set.add("Servle/JSP");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		System.out.println(set.contains("Java"));
		System.out.println(set.contains("Java2"));
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
