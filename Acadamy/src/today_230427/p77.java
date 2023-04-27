package today_230427;

public class p77 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long lz1 = (long) x * (long) y;
		long lz2 = (long)(x * y);
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
		
		
//		x*y 가 integer로 표현가능한 범위를 넘어서서 -727379968 이 나옴
		
	}

}
