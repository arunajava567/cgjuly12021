package utility;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		/*List a=Arrays.asList(2,3,4,5,6,7);
		for(Object x: a)
			System.out.println(x);*/
		
		
		int a1[]= {3,2,4,5,1,7,2,1};
		for(int x: a1)
			System.out.print(x+"  ");
		Arrays.sort(a1);
		System.out.println("after sorting...");
		for(int x: a1)
			System.out.print(x+"  ");
		System.out.println();
		int i=Arrays.binarySearch(a1,5);
		System.out.println("found at"+i);
	}

}
