package today_230427;

public class p74 {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("result1 : " + result1);

		int result2 = v1-v2;
		System.out.println("result2 : " + result2);
		
		int result3 = v1*v2;
		System.out.println("result3 : " + result3);
		
		int result4 = v1/v2;
		System.out.println("result4 : " + result4);
		
		int result5 = v1%v2;
		System.out.println("result5 : " + result5);
		
		double result6 = (double) v1/v2;
		System.out.println("result6 : " + result6);
		
//		v1을 douvle로 명시적 type casting 하라.
//		double 로 v1 이 type casting 됨. 
//		double 5 / int 2  = 5.0 / 2
//		5.0 / v2 = 5.0 / 2 = 더 큰 byte 타입인 double로 계산됨.
	
	}

}
