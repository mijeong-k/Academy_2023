package p230502;

public class P2_p46 {

	public static void main(String[] args) {
		int scores[] = { 83, 90, 87, 79 }, sum=0, cnt=0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
			sum += scores[i];
			cnt++;
		}
		double avg = (double) sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", avg);
	}

}
