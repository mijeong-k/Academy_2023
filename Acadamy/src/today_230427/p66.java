package today_230427;

public class p66 {

	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result1);
		System.out.println(result2);

		
//		5line 에서 x 정의, 7line 에서 x 재정의
//		6line 에서 y 정의, 9line 에서 y 재정의
	}

}
