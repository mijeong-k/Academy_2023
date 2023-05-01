package p230428;

public class P2_p18 {

	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };

		int sum = 0;
		for (int s : scores) {
			sum+=s;
		}
		System.out.println("sum : " + sum);
		
		int sum2 = 0;
		for (int i =0; i <scores.length; i++) {
			sum2 += scores[i];
		}
		System.out.println("sum : " + sum2);
	}

}

//		배열 숫자가 5개라서 총 20바이트 차지.
//		배열 첫번째 자릿수 9 = [0] , 두번째 자릿수 7 = [1]