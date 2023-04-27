package today_230427;

public class p75 {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
		
		
//		char c4 = c2 + 1;

//		char 타입에 작은따옴표를 하면 리터럴임=상수로 인식=아스키코드(상수)로 자동변환
//		따라서 65+1 과 같은 값이 되는 거고, 'A' + 1이 int로 변환되는건 아님
//		c2는 리터럴로 인식되게끔 ''를 써주지 않았기 때문에 문자도 아니고, 
//		리터럴도 아니기 때문에 오류남. 리터럴로 바꾸려해도 c2가 문자열이라 안됨.
//		문자만 리터럴로 할 수 있음
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		
		System.out.printf("%d\n", (int)c2);
		System.out.printf("%c\n", c2);
	}

}
