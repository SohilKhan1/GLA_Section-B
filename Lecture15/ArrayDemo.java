package Lecture15;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(arr.length);

//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		arr[-1] = 85;

//		for(int i=0;i<arr.length;i++ ) {
//			arr[i]=i+10;
//		}
		
//		int [] brr = {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++ ) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
