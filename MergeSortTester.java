import java.util.*;
import java.util.concurrent.*;

public class MergeSortTester {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scnr.nextInt();
		scnr.close();
		
		int[] testArray = new int[n];
		for (int i = 0; i < n; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(-n, n + 1);
			testArray[i] = randomNum;
		}
		System.out.println("ORIGINAL");
		System.out.println(MergeSorter.printArray(testArray));
		
		MergeSorter.mergeSort(testArray, 0, n - 1);
		
		System.out.println("SORTED");
		System.out.println(MergeSorter.printArray(testArray));
		
	}
}
