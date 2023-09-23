package Lecture15;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40 };
		int brr[] = { 100, 200, 300, 400 };

		System.out.println(arr[0] + " " + brr[0]);
		swap(arr[0], brr[0]);
		System.out.println(arr[0] + " " + brr[0]);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
}
