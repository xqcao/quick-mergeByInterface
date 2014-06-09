package quicksortdemo2;

import java.util.Arrays;

public class quicksortdemo {

	public static void main(String[] args) {
		int[] abc = { 12, 32, 11, -15, 27, 33, 22, 19, 28, 13, 17 };
		int[] aaa = Arrays.copyOf(abc, abc.length);
		
		getquickres getres = new getquickres();
		/*
		getres.doQuickSort(aaa, 0, aaa.length);
		
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(aaa));
		*/
		getres.DoMerge(aaa);
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(aaa));

	}

}
