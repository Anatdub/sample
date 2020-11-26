package first;

import java.util.regex.Pattern;

public class GCD {
	public static void m(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + j);
			}
			System.out.println(i);
		}
		System.out.println(Pattern.matches("А.+а","Ал,byfb"));//
	}

	public static void mr(int n) {
		mr(1, n);
	}

	public static void mr(int i, int n) {
		if (i <= n) {
			mr(1, i, n);
			System.out.println(i);
			mr(i + 1, n);
		}
	}

	public static void mr(int j, int i, int n) {
		if (j <= n) {
			System.out.print(i + j);
			mr(j + 1, i, n);
		}
	}

	public static void main(String[] args) {
		mr(10);
		m(10);
	}

}
