
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		/*
		 * This function implements the merge sort algorithm on the integer array 'list'
		 * from index lo to index hi.
		 */
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		/*
		 * This method should merge the two subarrays from lo to mid, and
		 * from mid + 1 to hi into a new sorted array that overwrites
		 * the entries in list from lo to hi.
		 */
	}

	public static String printArray(int[] arr) {
		String returnString = "";
		for (int elem : arr) {
			returnString += elem + "\n";
		}
		return returnString;
	}
	
}
