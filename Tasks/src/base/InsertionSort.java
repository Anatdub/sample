package base;

public class InsertionSort {
	/** The method for sorting the numbers */
	  public static void insertionSort(double[] list) {
	    for (int i = 1; i < list.length; i++) {
	      /** insert list[i] into a sorted sublist list[0..i-1] so that
	           list[0..i] is sorted. */
	      double currentElement = list[i];
	      int k;
	      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
	        list[k + 1] = list[k];
	      }

	      // Insert the current element into list[k+1]
	      list[k + 1] = currentElement; 
	    }
	  }
	public static void main(String[] args) {
		double[] list = {1, 9, 4, 6, 5, -4};
		insertionSort(list);
		for (double d :list)
		System.out.println(d); 


	}
	
}
