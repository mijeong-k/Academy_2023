package today_230427;

public class p75 {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
		
		
//		char c4 = c2 + 1;

//		char 타입에 작은따옴표를 하면 문자리터럴. 
//		char 2byte 타입 + int 4byte 타입 = int 타입으로 계산.
//		따라서 문자리터럴을 아스키코드로 변환하여 int 로 인식하여 계산.
//		다만 , char 타입으로 선언하였기 때문에 출력값은 char로 출력 (B)
//		char c4 = c2 +1 ; 에서 
//		c2는 문자리터럴도 아니고, 정수리터럴도 아니고, 문자열 리터럴도 아니라서 오류. 
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);				
		System.out.printf("%d\n", (int)c2);
		System.out.printf("%c\n", c2);
	}

}
