package base;

public class SimpleNumbers {
	public static void main(String[] args) {

        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
        out_for:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue out_for;
                }
            }
            System.out.print(i+" ");
        }


	}
}
