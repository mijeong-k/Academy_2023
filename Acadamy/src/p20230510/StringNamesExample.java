package p20230510;

public class StringNamesExample {

	public static void main(String[] args) {
		String[] names = null;
		names = new String[] {"A", "B", "C"};
		
		System.out.println(names);
		System.out.println(names[0]);
	}

}

// 주소값은 아니고 해시코드(hash code : 각 객체의 주소값을 변환하여 생성한 고유한 정수값)