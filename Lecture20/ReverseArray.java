package Lecture20;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		for (int i = 0; i < k; i++) {
			int val = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = val;
		}
		for (int k1 : arr) {
			System.out.print(k1 + " ");
		}

	}

}
