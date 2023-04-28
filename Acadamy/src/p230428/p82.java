package p230428;

public class p82 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		double z = x / y;
//		double z = x % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(z + 2);

	}

}


//		class 는 일반적으로 대문자로 시작한다.
//		Double=wrapper class
//		isInfinite,isNaN 메서드 = is가 붙는 메서드는 return값이 boolean으로 산출.