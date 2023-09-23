package Lecture9;

public class RevserseNumber {
	public static void main(String[] args) {
		int n = 12345;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
