package p230612;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		if (ts.add("Korea")) {
			System.out.println("첫 번째 korea 추가 성고");
		}else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		
		if (ts.add("China")) {
			System.out.println("첫 번째 china 추가 성공");
		}else {
			System.out.println("첫 번째 china 추가 실패");
		}
		
		if (ts.add("America")) {
			System.out.println("첫 번째 america 추가 성공");
		}else {
			System.out.println("첫 번째 america 추가 실패");
		}	
		
		if (ts.add("China")) {
			System.out.println("두 번째 china 추가 성공");
		}else {
			System.out.println("두 번째 china 추가 실패");
		}
		
		System.out.println("Iterator로 전체 원소 순회-----------");
		Iterator<String> it =ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
