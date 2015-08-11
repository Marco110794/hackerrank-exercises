package math;

public class SuperPower {

	public static void main(String[] args) {
		System.out.println(superPower(125));
	}
	
	static int superPower(int z) {
		int p = 0, q = 0;
		
		for (int i = 2; i <= z; i++) {
			if ((z % i) == 0) {
				if (q == 0) {
					p = i;
				} else if (p != i) {
					p = 0;
				}
				
				q++;
				z /= i;
				
				i = 1;
			}
		}
		
		if ((z == 1) && (p > 1) && (q > 1)) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
