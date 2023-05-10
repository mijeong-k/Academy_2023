package p20230510;

public class MethodExample {

	public static void main(String[] args) {

		int sum2 = add(new int[] { 90, 90, 90 });
		System.out.println("총합: " + sum2);
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			print1();
			print2();
		}
	}//main(실행)매서드
	
	
	
	public static int add(int[] scores2) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores2[i];
		}
		return sum; 
	}//add 매서드

	public static int multiple(int scores3) {
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			sum = sum*scores3;
		}
		return sum; 
	}//multiple 매서드
	
	public static void print1() {
		System.out.println("출력하라");
		System.out.println(add(new int[] {80,80,80}));
		System.out.println(multiple(10));
	}//print1 매서드
	
	public static void print2() {
		System.out.println("---------------------");
	}//print2 매서드
}