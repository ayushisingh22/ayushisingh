package com.tnsif.dayten.singledimensionaldemo;
import java.util.Arrays;
public class ArrayClassDemo {
	public static void main(String[] args) {
		int intArr[] = {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr));
		for( int i=0; i<intArr.length; i++)
		{
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));		
		System.out.println(Arrays.binarySearch(intArr, 50));
		System.out.println(Arrays.binarySearch(intArr, 2, 4, 35));
		System.out.println(Arrays.toString(intArr));
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		Arrays.sort(intArr1);
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are same ");
		}
		else 
		{
			System.out.println("Both arrays are not same ");
		}
		int intArr2[] = Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));	
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 4);
		System.out.println(Arrays.toString(intArr3));
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
	}
}