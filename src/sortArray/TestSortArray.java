package sortArray;

import java.util.Scanner;

public class TestSortArray extends SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TestSortArray tsa = new TestSortArray();
		
		System.out.println("Enter how many elements you want to enter in array ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] sortedArr = tsa.sort(arr);
		System.out.println("Sorted Array is ");
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i] + " ");
		}
		
	}

}
