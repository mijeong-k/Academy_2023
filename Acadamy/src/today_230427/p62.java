package today_230427;

public class p62 {

	public static void main(String[] args) {
		short s = 100;
		
//		short result = -s;
//		Type mismatch: cannot convert from int to short
//		short 타입에 -를 붙이면 int 타입으로 자동으로 변환됨.
		
		short result = (short) -s;
		System.out.println(result);
		
		int result1 = -s;
		System.out.println(result1);
		
		int result2 = -s;
		
		System.out.println(s);
		System.out.println(result2);
		
	}

}
