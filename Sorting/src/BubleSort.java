
public class BubleSort {
	/** The method for sorting the numbers */
	  public static void bubleSort(double[] array) {
		  for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    double temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }

	  }
	public static void main(String[] args) {
		double[] list = {1, 9, 4, 6, 5, -4};
		bubleSort(list);
		for (double d :list)
		System.out.println(d); 


	}
	
}
