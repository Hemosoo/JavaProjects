import java.util.*;

public class lightsout {

    static boolean a[][];
    static int n, r, c;
    static int[] dr = {-1, 1, 0, 0, -1, 1, -1, 1, -2, 2, 0, 0};
    static int[] dc = {0, 0, -1, 1, -1, 1, 1, -1, 0, 0, -2, 2};
    static Scanner in;
    
    public static void main(String[] args) {

        in = new Scanner(System.in);
        n=5;
        while(n-->0) solve();

    }    
    
    static void solve(){
    	a= new boolean[8][8];
        //step1
        int n = in.nextInt();
        while(n-->0) first();
        
        //step2
        n = in.nextInt();
        while(n-->0) second();
    
        
        //step3
        int ans = 0;
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(a[i][j]) ans++;
            }
        }
        
        System.out.println(ans);
    }
    
    static void first() {
        String s = in.next();
        int x = Character.getNumericValue(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
        	int y = Character.getNumericValue(s.charAt(i));
        	a[x-1][y-1] = !a[x-1][y-1];
        }
        
    }
    
    static void second() {
        String s = in.next();
        int x = Character.getNumericValue(s.charAt(0));
        int y = Character.getNumericValue(s.charAt(1));
        a[x-1][y-1] = !a[x-1][y-1];
        for(int i = 0; i < 12; i++) {
        	int nx = x-1 + dr[i];
        	int ny = y-1 + dc[i];
        	if(nx < 0 || ny < 0 || nx >= 8 || ny >= 8) {
        		continue;
        	}
        	a[nx][ny] = !a[nx][ny];
        }
    }

    static void print(boolean[][] a) {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(a[i][j]) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}


/*

2 434 523 1 43
1 58 1 58
1 58 1 57
3 32 44 56 2 54 18
4 345 456 567 678 2 36 55


*/