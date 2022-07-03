import java.util.*;
public class abc {
	static Scanner in;
	static int[] nums;
	public static void main(String[] args) {
		nums = new int[7];
		in = new Scanner(System.in);
		for(int i = 0; i < 7; i++) {
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		int a = nums[0];
		int b = nums[1];
		int abc = nums[nums.length-1];
		int c = abc - a - b;
		System.out.println(a + " " + b + " " + c);
	}
}
// 2 2 11 4 9 7 9