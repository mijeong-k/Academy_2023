package p230609;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		list.add("Java");
		
		int size = list.size();
		System.out.println("총 객체수: "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		String skill2 = list.get(3);
		System.out.println("3: "+skill2);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		list.remove("Java");  //제일 위 인덱스인 Java가 삭제됨
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
