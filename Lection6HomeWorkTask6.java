//34
package com.gmail.tsikalenko.nikita;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[] {0,2,4,6,8,10,12};
		int[] arr2 = new int[] {1,4,7,10,13};
		int[] arr3 = new int[] {1,2,4,8,16,32};
		int[] arr4 = new int[] {1,3,9,27};
		int[] arr5 = new int[] {1,4,9,16,25};
		int[] arr6 = new int[] {1,8,27,64,125};
		System.out.println(Arrays.toString(arr1));
		System.out.println(nextElement(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(nextElement(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(nextElement(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(nextElement(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(nextElement(arr5));
		System.out.println(Arrays.toString(arr6));
		System.out.println(nextElement(arr6));
	}
	public static int nextElement(int[] arr) {
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			return arr[arr.length-1] + (arr[2] - arr[1]);
		} else if(arr[1]/(double)(arr[0]) == arr[2]/(double)(arr[1])) {
			return (int)(arr[arr.length-1] * (arr[2]/(double)(arr[1])));
		} else if((arr[2] - arr[1])-(arr[1] - arr[0])  == (arr[3] - arr[2])-(arr[2] - arr[1])) {
			return arr[arr.length-1] + (arr[arr.length-1] - arr[arr.length-2] + (arr[3] - arr[2])-(arr[2] - arr[1]));
		} else if((((arr[3] - arr[2])-(arr[2] - arr[1]))-((arr[2] - arr[1])-(arr[1] - arr[0])))  == (((arr[4] - arr[3])-(arr[3] - arr[2]))-((arr[3] - arr[2])-(arr[2] - arr[1])))) {
			return arr[arr.length-1] + (arr[arr.length-1] - arr[arr.length-2] + ((arr[arr.length-1] - arr[arr.length-2])-(arr[arr.length-2] - arr[arr.length-3])) + (((arr[3] - arr[2])-(arr[2] - arr[1]))-((arr[2] - arr[1])-(arr[1] - arr[0]))));
		}
		return 0;
	}

}
