package today_230427;

public class p70 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		b = ~a;
		
		System.out.println(a);
		System.out.println(b);
		
		b = ~b;
		
		System.out.println(b);
	}

}


//		10의 비트반전연산자를 구하라.
//		step01. 정수 10을 32비트로 표현 = 000...1010(2)
//		step02. 반전하라 = 111...0101(2)
//		step03. 정수로 표현하자 = 2의 보수를 구하라 = 1의 보수+1
//		step04. 1의 보수를 구하자 = 반전 = 000...1010(2)
//		step05. 2의 보수를 구하자 = 1의 보수 + 1 = 000...1011(2)
//		step06. step02 반전했을 때 부호비트를 반영
//		step07. - 000...1011(2)
//		step08. 10진수로 변환 = -11

