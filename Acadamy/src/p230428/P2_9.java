package p230428;

public class P2_9 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}

	}
}

//		Math.random() 은 double 타입.
//		0.0 <= X < 1.0 
//		0.0 <= 6X < 6.0
//		0<= (int) 6X < 6
//		1<= (int) 6X+1 < 7
//		random으로 1~6값만 넣을 수 있음.