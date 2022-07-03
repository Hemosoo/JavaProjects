import java.util.*;
import java.io.*;

public class Prob03 {

    static String file = "Prob03";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(new File(file+".in.txt"));
        out = new PrintWriter(new File("out.txt"));
        
        init();
        solve();
        
        

        in.close();
        out.close();
        Check.check(file+".out.txt");
    }
    
    static void init() {
        
        n = in.nextInt();   
        in.nextLine();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	String[] str = in.nextLine().split(", ");
        	int[] nums = new int[3];
        	for(int j = 0; j < 3; j++) {
        		nums[j] = Integer.parseInt(str[j]);
        	}
        	Arrays.sort(nums);
        	if((nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[2] + nums[0] <= nums[1])) {
        		out.println("Not a Triangle");
        	} else if(nums[0] == nums[1] && nums[1] == nums[2]) {
        		out.println("Equilateral");
        	} else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
        		out.println("Isosceles");
        	} else {
        		out.println("Scalene");
        	}
        }
    }
}