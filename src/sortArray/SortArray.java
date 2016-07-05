package sortArray;

public class SortArray {
	private int min;
	private int temp;
	public int[] sort( int[] arr ) {
		
		for(int i=0;i<=arr.length-1;i++) {
			min = arr[i];
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min > arr[j]) {
					temp = arr[j];
					arr[j] = min;
					min = temp;
				}
			}
			arr[i] = min;
		}
		
		return arr;
	}
}
