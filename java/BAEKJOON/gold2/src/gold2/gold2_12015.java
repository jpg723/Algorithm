package gold2;

import java.util.Scanner;

public class gold2_12015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int[] arr = new int[number];
		
		for(int i = 0; i < number; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int length = 0;
		int temp = 0;
		
		for(int i = 0; i < number; i++) {
			
			if(temp == number - 1)
				break;
			
			for(int j = i + 1; j < number; j++) {
				
				if(arr[i] < arr[j]) {
					length++;
					temp = j;
					break;
				}		
			}
			
		}
		
		System.out.println(length);

	}

}
