package Lecture22;

import java.util.Scanner;

public class WaveColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		Wave(arr);
		sc.close();

	}

	private static void Wave(int[][] arr) {
		// TODO Auto-generated method stub
		int i = 0;

		while (i < arr[0].length) {

			if (i % 2 == 0) {
				int row = 0;
				int col = i;
				for (int j = row; j < arr.length; j++) {
					System.out.print(arr[j][col]+" ");
				}
			} else {
				int row = arr.length - 1;
				int col = i;
				for (int j = row; j >= 0; j--) {
					System.out.print(arr[j][col]+" ");
				}
			}
			System.out.println();

			i++;
		}
	}

}


//
//11 12 13 14
//21 22 23 24
//31 32 33 34
