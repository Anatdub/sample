package base;

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
		int n = 100;
        double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*100;
        }
		bubleSort(array);

		for (double d :array)
		System.out.println(d); 


	}
	
}
