package today_230427;

public class p64 {

	public static void main(String[] args) {
		int A = 5;
		
		System.out.println(A++);
		System.out.println(A);
		
//		5라인의 연산자는 두개. System.out.println  ,  (A++)
//		5먼저 println 하고, 그 다음에 A++ 만하라(출력하라는 연산은 아니니까, 재정의 개념)
//		A++ 한 값으로 A가 다시 정의됨.
		
		int B = 5;
		
		System.out.println(++B);
		System.out.println(B);
				
//		5라인의 연산자는 두개. System.out.println  ,  (++B)
//		++이 앞에 붙었으니까, ++연산 먼저 해야 됨
//		B=B+1 먼저 해서 B값 재정의 한 다음에 출력=6
//		++B 한 값으로 B가 다시 정의된 상태에서 출력		
		
		
		
	}

}
