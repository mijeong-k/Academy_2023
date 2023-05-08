package p230508;

public class LottoMaker {

	public static void main(String[] args) {


//1. boolean 사용
		boolean f1 = false; 	
		do {
			f1 = false;
			int num1 = (int) (Math.random() * 45) + 1;
			int num2 = (int) (Math.random() * 45) + 1;
			int num3 = (int) (Math.random() * 45) + 1;
			int num4 = (int) (Math.random() * 45) + 1;
			int num5 = (int) (Math.random() * 45) + 1;
			int num6 = (int) (Math.random() * 45) + 1;
			
			System.out.print(num1+" ");
			System.out.print(num2+" ");
			System.out.print(num3+" ");
			System.out.print(num4+" ");
			System.out.print(num5+" ");
			System.out.println(num6);
			
			if(num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) { //1st
				f1 =true;
			}
			if(num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) { //2nd
				f1 =true;
			}
			if(num3 == num4 || num3 == num5 || num3 == num6) { //3rd
				f1 =true;
			}
			if(num4 == num5 || num4 == num6) { //4th
				f1 =true;
			}
			if(num5 == num6) { //5th
				f1 =true;
			}
			
		}while(f1); //if문이 true가 되면 do문 무한루프. false가 되어 겹치지 않아야 멈출 수 있음.
		System.out.println("\n"+"--------------------------------");
	

		
//2. do-while 사용
		int num1,num2,num3,num4,num5,num6;
		do {
			 num1 = (int) (Math.random() * 45) + 1;
			 num2 = (int) (Math.random() * 45) + 1;
			 num3 = (int) (Math.random() * 45) + 1;
			 num4 = (int) (Math.random() * 45) + 1;
			 num5 = (int) (Math.random() * 45) + 1;
			 num6 = (int) (Math.random() * 45) + 1;
			
			System.out.print(num1+" ");
			System.out.print(num2+" ");
			System.out.print(num3+" ");
			System.out.print(num4+" ");
			System.out.print(num5+" ");
			System.out.println(num6);
	
		}while(num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6); 
		System.out.println("\n"+"--------------------------------");
		
		
//1번과 2번 케이스는 반복되면 반복되지 않은 6개 숫자가 나올때까지 계속 출력함.

		
		
//3. 배열 사용
		int[] num = new int[6];
		boolean f2=false;
		
		do {
			f2 = false;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
			}
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i != j && num[i] == num[j]) {
						f2 = true;
					}
				}
			}
		} while (f2);
		
		
		
//		while (true) {
//			if (num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6)
//				System.out.print(num1 + " ");
//			if (num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6)
//				System.out.print(num2 + " ");
//			if (num3 != num4 && num3 != num5 && num3 != num6)
//				System.out.print(num3 + " ");
//			if (num4 != num5 && num4 != num6)
//				System.out.print(num4 + " ");
//			if (num5 != num6)
//				System.out.print(num5 + " ");
//			System.out.println(num6);
//			break;
//		}

	}
}








