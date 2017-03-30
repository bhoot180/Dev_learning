package listNumber;

public class ListNumber {

	public static int[] selectionSort(int[] arr){
		
		
			for (int i = 0; i < arr.length - 1; i++){
				
				int index = i;
				for (int j = i + 1; j < arr.length; j++){
					if (arr[j] < arr[index]){
						index = j;
					}
				int smallerNumber = arr[index];
				arr[index] = arr[i];
				arr[i] = smallerNumber;
				
				}
				
			}
			
			return arr;
			
	}
	public static void main(String a[]){
			int[] arr1 = { 342, 128, 902, 91, 241, 167, 803, 75, 342, 192 };
			int[] arr2 = selectionSort(arr1);
			for(int i:arr2){
				System.out.print(i);
				System.out.print(", ");
				
			}
			
			
			
	}
}

// Im going to need extra help on these and probably a few extra problem. I really didn't understand this