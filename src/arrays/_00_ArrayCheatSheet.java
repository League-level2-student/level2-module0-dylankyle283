package arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"yes","no","yes","no","yes"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "no";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		
		int[] numbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
		int lowest = 50;
		int biggest = 0;
		for (int i = 0; i < 50; i++) {
			
			
			
			
			
			int rand = new Random().nextInt(50);
			numbers[i] = rand;
			
			
			
			
			if(numbers[i] <= lowest) {
				lowest = numbers[i];
				
			}
			
			if (numbers[i] > biggest) {
				biggest = numbers[i];
			}
			
			System.out.println(numbers[i]);
			
		}
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("lowest is: " + lowest );
		//9 print the entire array to see if step 8 was correct
	
		//10. print the largest number in the array.\
		
		System.out.println("biggest is: " + biggest );
		
	}
}
