public class GenericSort {
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;
		for (int i = 0; i < list.length - 1; i++) {
// Поиск minimum в list[i+1..list.length-2]
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			} // продолжение на след. слайде
//Swap list[i] with list[currentMinIndex]
//	if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	

}
