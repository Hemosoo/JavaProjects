
import java.util.*; 
public class wordworm{
    
    static int dr[] = { -1, 1, 0, 0, -1, 1, 1, -1 };
    static int dc[] = { 0, 0, -1, 1, -1, 1, -1, 1 };
    static int n, m, cnt, ind;
    static char word[], a[][];
    static boolean v[][], found;
    static Scanner in;
    
    public static void main(String[] args) {
        
        in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
        	init();
            solve();
        }
        
        in.close();        
    }
    
    static void init() {
        
        n = in.nextInt();
        m = in.nextInt();
        a = new char[n][m];
        
        for(int i=0; i<n; i++) 
            for(int j=0; j<m; j++) 
                a[i][j] = in.next().charAt(0);     
        //System.out.println(Arrays.deepToString(a));
    }
    
    static void solve() {
    	int t = in.nextInt();
    	for(int i = 0; i < t; i++) {
    		ind = 0;
    		found = false;
    		word = in.next().toCharArray();
    		//System.out.println(Arrays.toString(word));
    		cnt=0;
            for(int k=0; k<n; k++) {
            	if(found) break; 
                for(int j=0; j<m; j++) {
                	if(dfs(k, j, 0)) {
                		System.out.println(word);
                		found = true;
                	}
                	if(found) break;
                }
            }
            
            
    	}
        
    }
        
    static boolean dfs(int r, int c, int index) {
    	if(word[index] != a[r][c]) {
    		return false;
    	}
    	if(index+1 == word.length) return true;
    	for(int i = 0; i < 8; i++) {
    		int nr = r+dr[i];
    		int nc = c+dc[i];
    		
    		if(nr<0||nc<0||nr>=a.length||nc>=a[0].length) continue;
    		
    		if(dfs(nr, nc, index+1)) return true;
    	}
    	return false;
    }
}