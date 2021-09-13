package test4;

public class test4 {
	
	public static void insertionSort(int arr[], int n)
	{
	    int i, key, j;
	    for (i = 1; i < n; i++)
	    {
	        key = arr[i];
	        j = i - 1;
	 
	        /* Move elements of arr[0..i-1], that are
	        greater than key, to one position ahead
	        of their current position */
	        while (j >= 0 && arr[j] > key)
	        {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}
	
	public static void main(String[] args) {
		int[] s = {9,8,7,6,5,4,3,2,1};
		insertionSort(s,9);
		for (int i = 0; i < s.length; i++) {
		    System.out.print(s[i] + " ");
		}
	}

}
