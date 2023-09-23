package Lecture16;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 4;

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

	}

}
