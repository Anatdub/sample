package base;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
        int test_array[] = {0,1,0,2,3,0,4,2};
        /*
            Arrays.toString:
            см. https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
         */
        System.out.println(Arrays.toString(removeElement(test_array, 0)));
        System.out.println(Arrays.toString(removeElementTail(test_array, 0)));
        System.out.println(Arrays.toString(removeElementNew(test_array, 0)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длиной nums.length - offset
        return Arrays.copyOf(nums, nums.length - offset);
    }
    public static int[] removeElementTail(int[] nums, int val) {
        int offset = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                nums[i - offset] = nums[i];
            }
        }

        int[] newArray = new int[nums.length - offset-1];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = nums[i];
        }
        return newArray;
    }
    public static int[] removeElementNew(int[] nums, int val) {
        int count = 0;

        // —начала вычислим длину нового массива
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }

        int[] newArray = new int[count-1];
        int offset = 0;

        // ƒалее всЄ как в прошлых решени€х,
        // только запись идЄт в новый массив
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                offset++;
            } else{
                newArray[i] = nums[i- offset];
            }
        }

        return newArray;
    }


}