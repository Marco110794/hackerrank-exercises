package math;

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			long k = sc.nextLong();
			System.out.println(cutChocolate(k));
		}
		
		sc.close();
	}
	
	static long cutChocolate(long k) {
		return (k - k / 2) * (k / 2);
	}
	
}
