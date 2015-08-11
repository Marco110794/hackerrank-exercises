package math;

public class PowerOfTwo {

	public static void main(String[] args) {
		int[] numbers = {2, 3, 4};
		int[] result = countTwos(numbers);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	static int[] countTwos(int[] arr) {
		int[] answer = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int j = 1;
			
			while (j <= arr[i]) {
				j *= 2;
				
				if (j == arr[i]) {
					answer[i] = 1;
				}
			}
		}
		
		return answer;
	}
	
}
