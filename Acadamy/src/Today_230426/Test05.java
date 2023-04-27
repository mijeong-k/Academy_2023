package Today_230426;

public class Test05 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 100;
		int i3 = 65;
		
//		char 은 문자하나를 저장하는 타입. 65는 정수이고, int 타입이라 호환불가
//		65 10진수는 2진수로 변환하면 1000001 이고, int(4byte=32bit)뿐 아니라,
//		char(2byte=16bit) 16자리 안에 7자리만 차지하면 되니까 손실없이 포함됨
//		따라서 변수선언 허용은 됨(암묵적 type casting) 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(i3);
	}

}
