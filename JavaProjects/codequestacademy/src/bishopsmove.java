import java.io.*;
import java.util.*;
public class bishopsmove {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++) {
			in.nextLine();
			String[] a = in.nextLine().split(",");
			String[] b = in.nextLine().split(",");
			int i1 = Integer.parseInt(a[0]);
			int i2 = Integer.parseInt(a[1]);
			int j1 = Integer.parseInt(b[0]);
			boolean f = false;
			int j2 = Integer.parseInt(b[1]);
			if(i1%2 == i2%2) {
				if(j1%2 == j2%2) {
					System.out.println("YES");
					f = true;
				}
			} else {
				if(j1%2 != j2%2) {
					System.out.println("YES");
					f = true;
				}
			}
			if(!f) System.out.println("NO");
		}
	}
}
