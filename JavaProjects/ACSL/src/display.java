import java.util.*;
import java.io.*;
public class display {
	
	public static void main(String[] args) {
		System.out.println(displayTime("12:00:00"));
	}
	public static String displayTime(String time) {
		String[] t = time.split(":");
		int hr = Integer.parseInt(t[0]);
		int min = Integer.parseInt(t[1]);
		int sec = Integer.parseInt(t[2]);
		
		String[] c = {"r", "g", "b", "y", "c", "m", "w", "k"};
		ArrayList<String> ans = new ArrayList<String>();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				for(int l = 0; l < 8; l++) {
					for(int m = 0; m < 8; m++) {
						for(int p = 0; p < 8; p++) {
							int[] tim = {0, 0, 0};
							if(hr(c[p])) add(tim, 0, 5);
							if(min(c[p])) add(tim, 1, 5*5);
							if(sec(c[p])) add(tim, 2, 5*5);
							if(hr(c[m])) add(tim, 0, 3);
							if(min(c[m])) add(tim, 1, 3*5);
							if(sec(c[m])) add(tim, 2, 3*5);
							if(hr(c[l])) add(tim, 0, 2);
							if(min(c[l])) add(tim, 1, 2*5);
							if(sec(c[l])) add(tim, 2, 2*5);
							if(hr(c[j])) add(tim, 0, 1);
							if(min(c[j])) add(tim, 1, 5);
							if(sec(c[j])) add(tim, 2, 5);
							if(hr(c[i])) add(tim, 0, 1);
							if(min(c[i])) add(tim, 1, 5);
							if(sec(c[i])) add(tim, 2, 5);
							if(Math.floor((tim[2]/60)) >= 1) {
					        	tim[1] += Math.floor(tim[2]/60);
					        	tim[2] = tim[2]%60;
					        }
							if(Math.floor((tim[1]/60)) >= 1) {
					        	tim[0] += Math.floor(tim[1]/60);
					        	tim[1] = tim[1]%60;
					        }
					        if(tim[0] >= 13) {
					        	tim[0] = tim[0]%12;
					        }
					       
					        	
					        	
					        if(tim[0] == hr && tim[1] == min && tim[2] == sec) {
					        	//System.out.println(Arrays.toString(tim));
					        	ans.add(c[i]+c[j]+c[l]+c[m]+c[p]);
					        }
							
							
						}
					}
				}
			}
		}
		Collections.sort(ans);
		String a = "";
		for(String s: ans) {
			a+=s+ " ";
		}
		return a.substring(0, a.length()-1);
	}
	public static boolean hr(String col) {
		if(col.equals("k")) return false;
		if(col.equals("r") || col.equals("y") || col.equals("w") || col.equals("m")) return true;
		return false;
	}
	public static boolean min(String col) {
		if(col.equals("k")) return false;
		if(col.equals("g") || col.equals("y") || col.equals("w") || col.equals("c")) return true;
		return false;
	}
	public static boolean sec(String col) {
		if(col.equals("k")) return false;
		if(col.equals("b") || col.equals("c") || col.equals("w") || col.equals("m")) return true;
		return false;
	}
	public static void add(int[] a, int ind, int b) {
		a[ind]+=b;
	}
}
