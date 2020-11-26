package generics;

public class CustomArrayList <GENERIC_TYPE> {
 private Object[] data = new Object[0];
 private int lenght = 0;
 public void add(GENERIC_TYPE element) {
	 if (lenght == data.length) {
		  Object[] newData = new Object[data.length*2+1];
		  for(int i = 0;i<data.length; i++){
			  newData[i]=data[i];
		  }
		  //	   System.arraycopy(data, 0, newData, 0, data.length);
		  data =newData;
	 }
	 data[lenght] = element;
	 lenght++;
 }
 public GENERIC_TYPE get(int index) {
	if (index >= data.length || index <0) {
		throw new ArrayIndexOutOfBoundsException();
	}
	return (GENERIC_TYPE) data[index];
 }
 public int getLength() {
	 return lenght;
 }
 public void clear() {
	 data = new Object[0];
 }
}