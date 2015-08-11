package math;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int[] sequence = new int[number];
		
		int difference = 0;
		int missingNumber = 0;
		
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = sc.nextInt();
			
			if (i == 1) {
				difference = sequence[1] - sequence[0];
			}
		}
		
		for (int i = 0; i < sequence.length - 1; i++) {
			if ((sequence[i] + difference) != sequence[i + 1]) {
				missingNumber = sequence[i] + difference;
			}
		}
		
		System.out.println(missingNumber);
		
		sc.close();
	}
	
}
