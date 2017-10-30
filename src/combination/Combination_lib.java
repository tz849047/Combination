package combination;

public class Combination_lib {
	private int s,r;
	
	public Combination_lib(int s,int r) {
		this.s = s;
		this.r = r;
	}
	
	public int getFActorial() {
		int n, m, l, a;
		
		n = kaijo(this.s);
		m = kaijo(this.r);
		l = kaijo(this.s - this.r);
		a = n / (m * l);
		
		return a;
	}

	public int kaijo(int k) {
		int a = 1;
		for(int i = 1; i <= k; i++)
			a = a * i;
		return a;
	}
}
