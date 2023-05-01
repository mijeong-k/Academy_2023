package p230428;

public class P2_p27 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0)
				continue;
			
			System.out.println(i);
		}

	}

}
//		i%2 != 0 홀수를 찾아라