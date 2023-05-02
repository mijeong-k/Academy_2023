package p230502;

import java.util.Scanner;

public class P2_plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			System.out.printf("%x ", num[i]);
		}
		sc.close();

//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			if (i <= num.length - 2) {
//				System.out.print(num[i] + ", ");
//			} else {
//				System.out.print(num[i]);
//			}
//		}
//		sc.close();

	}

}
