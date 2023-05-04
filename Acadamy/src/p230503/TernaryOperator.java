package p230503;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
//		if(inp<=50) {
//			System.out.println("A");
//		}else {
//			System.out.println("B");
//		}

		String str1="";
		str1 = (inp<=50) ? "A" : "B";
		System.out.println(str1);
		
		// 중첩
//		if (inp <= 50) {
//	         if (inp <= 25) {
//	            System.out.println("a");
//	         } else {
//	            System.out.println("A");
//	         }
//	      } else {
//	         System.out.println("B");
//	      }

	      String str2 = "";
	      str2 = (inp <= 50) ? ((inp <= 25) ? "a" : "A") : "B";
	      System.out.println(str2);

	}

}
