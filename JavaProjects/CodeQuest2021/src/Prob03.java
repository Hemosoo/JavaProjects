import java.util.*;
import java.io.*;

public class Prob03 {

    static Scanner in;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(System.in);
        
        init();
        solve();
        
        

        in.close();
    }
    
    static void init() {
        
        n = in.nextInt();
    }
    
    static void solve() throws IOException {
        for(int i = 0; i < n; i++) {
        	int n1 = in.nextInt();
        	int n2 = in.nextInt();
        	int dif = n1-n2;
        	if(dif == -15 || dif == -13 || dif == -11 || dif == -10 || dif == -8 || dif == -5 || dif == -4 || dif == -2 || dif == 1 || dif == 5 || dif == 12) {
        		System.out.println(2);
        	} else {
        		System.out.println(1);
        	}
        }
    }
}