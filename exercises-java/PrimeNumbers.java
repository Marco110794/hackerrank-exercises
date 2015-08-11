package math;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(getPrimeNumbers(200));
	}
	
	static int getPrimeNumbers(int n) {
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			int assist = 2;
			boolean prime = true;
			
			while ((assist <= Math.sqrt(i)) && prime) {
				if ((i % assist) == 0) {
					prime = false;
				}
				
				if ((assist % 2) == 0) {
					assist++;
				} else {
					assist += 2;
				}
			}
			
			if (prime) {
				count++;
			}
		}
		
		return count;
	}
	
}
