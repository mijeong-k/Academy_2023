package today_230427;

public class p73 {

	public static void main(String[] args) {
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		float f = 5.2f;
		
		int result1 = a + b;
		double result2 = c+d;
//		byte result3 = a+b;
//		작은 타입 byte + 큰 타입 int 이라서 int로 변환됨
		
		float result5 = c+f;
//		int result6 = c+f;
//		int 안에 float 는 담을 수 없음. 같은 바이트이지만, 소수점 정보가 더 추가되어서.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result5);
	}

}
