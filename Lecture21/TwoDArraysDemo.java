package Lecture21;

import java.util.*;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];
		
//		int [][] brr= {{1,2,3},
//					   {4,5,6},
//					   {7,8,9}};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][0]);


//		int row=arr.length;
//		int col = arr[0].length;
		
		//User Input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		//Print
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		sc.close();

	}

}
