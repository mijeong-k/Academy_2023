package p230612;

import java.util.HashSet;
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수 : "+set.size());

	}

}
