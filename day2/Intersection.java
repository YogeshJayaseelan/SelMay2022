package week1.day2;

public class Intersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {13,27,11,46,6,97};	 
	 * b) Declare another array for {1,27,8,46,9,97};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int arr1[] = {13,27,11,46,6,97};
		int arr2[] = {1,27,8,46,9,97};

		for (i=0,j=0; i<arr1.length && j<arr1.length; i++, j++)
		{
			if (arr1[i] == arr2[j])
			{
				System.out.println("Match Found : " + arr1[i]);
			}
		}
	}

}