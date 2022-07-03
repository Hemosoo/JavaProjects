import java.util.Arrays;

public class Lower_upperBound {
	public static void main(String[] args) {
		int a[] = {1, 3, 4, 6};
		int n = Arrays.binarySearch(a, 5);
		if(n>=0) System.out.println(n);
		else {
			int upper = n*-1 - 1;
			int lower = n*-1 - 2;
			System.out.println(a[upper] +" "+a[lower]);
		}
	}
}
