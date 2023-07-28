package p230725;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;

		do {
			char cinp = sc.next().charAt(0);
			if ((cinp > 64 && cinp < 91) || (cinp > 96 && cinp < 123)) {
				System.out.println(cinp);
			} else if (cinp >= '0' && cinp <= '9')
				System.out.println((int) cinp);
			else {
				b = false;
			}

		} while (b);
		sc.close();
	}

}
