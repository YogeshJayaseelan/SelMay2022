package week1.day2;

import java.util.Arrays;

public class MissingElementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8,10,12,19};
		
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length; i++)
		{
			if (arr[i] != (i+1)) {
				System.out.println("Missing Number: " + (i+1));
				
			}
		}
	}

}