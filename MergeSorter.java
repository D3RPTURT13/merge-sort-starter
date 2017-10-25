
public class MergeSorter {
	
	public static void mergeSort(int[] arr, int low, int hi) {
		if (low < hi) {
			int mid = (low + hi) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, hi);
			merge(arr, low, mid, hi);
		}
	}
	
	public static void merge(int[] arr, int low, int mid, int hi) {
		// method to merge two sub arrays (0 - mid, mid + 1, hi) into
		// a single sorted array
		
		int len = hi - low + 1;
		int[] scratch = new int[arr.length];
		for (int i = low; i <= hi; i++) {
			scratch[i] = arr[i];
		}
		int lowPoint = low;
		int hiPoint = mid + 1;
		int mergedPoint = 0;
		boolean merged = false;
		while (!merged) {
			if (scratch[lowPoint] < scratch[hiPoint]) {
				arr[mergedPoint] = scratch[lowPoint];
				mergedPoint++;
				lowPoint++;
				if (lowPoint > mid) {
					merged = true;
				}
			} else {
				arr[mergedPoint] = scratch[hiPoint];
				mergedPoint++;
				hiPoint++;
				if (hiPoint > hi) {
					merged = true;
				}
			}
		}
		if (lowPoint <= mid) {
			for (int i = lowPoint; i <= mid; i++) {
				arr[mergedPoint] = scratch[lowPoint];
				mergedPoint++;
			}
		} else if (hiPoint <= hi) {
			for (int i = hiPoint; i < hi; i++) {
				arr[mergedPoint] = scratch[lowPoint];
				mergedPoint++;
			}
		}
	}

	public static String printArray(int[] arr) {
		String returnString = "";
		for (int elem : arr) {
			returnString += elem + "\n";
		}
		return returnString;
	}
	
}
