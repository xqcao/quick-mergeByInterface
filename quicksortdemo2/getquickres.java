package quicksortdemo2;

import java.util.Arrays;

public class getquickres implements doQuick {

	@Override
	public void doQuickSort(int[] arrays, int start, int end) {
		int left = start;
		int right = end;
		int i, j;
		i = left;
		j = right;
		int temp;
		int pivot = arrays[left];
		while (i <= j) {
		while ((i++) < right - 1 && arrays[i] > pivot)
		;
		while ((--j) > left && arrays[j] < pivot)
		;
		if (i >= j) {
		break;
		}
		temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
		}
		arrays[left] = arrays[j];
		arrays[j] = pivot;
		if (left < j) {
		doQuickSort(arrays, left, j);
		}
		if (i < right) {
		doQuickSort(arrays, i, right);
		}

	}

	@Override
	public void DoMerge(int[] arr) {
		int m = arr.length/2;
		int[] arr1 = Arrays.copyOf(arr, m);
		int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
		if(m>0){
		DoMerge(arr1);
		DoMerge(arr2);
		doSort(arr1,arr2,arr);
		}	
		}
		public static void doSort(int[] arr1,int[] arr2,int[] result){
		int i = 0;
		int j = 0;
		int k = 0;
		int[] temp = new int[ arr1.length + arr2.length ];
		while(i<arr1.length && j < arr2.length) {
		if(arr1[i] > arr2[j]){
		temp[k++] = arr1[i++];
		} else{
		temp[k++] = arr2[j++];
		}
		}
		while(i<arr1.length) {
		temp[k++] = arr1[i++];
		}
		while(j<arr2.length) {
		temp[k++] = arr2[j++];
		}
		for(i=0; i <temp.length; i++) {
		result[i] =temp[i];
		}
		}

}
