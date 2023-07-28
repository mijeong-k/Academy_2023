package p230725;

public class Info {
	private String[] str;
	private int[] inp;

	public void setStr(String[] str) {
		this.str = str;
	}

	public void setInp(int[] inp) {
		this.inp = inp;
	}

	public void print() {
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < inp.length; i++) {
			min = (inp[i] < min) ? inp[i] : min;
			if (min == inp[i]) {
				cnt = i;
			}
		}
		System.out.println(str[cnt] + " " + min);
	}
}
