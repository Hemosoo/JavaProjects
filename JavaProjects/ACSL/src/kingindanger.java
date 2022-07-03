import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class kingindanger {
	static int[][] board =  new int[8][8];
	static ArrayList<String> pieces = new ArrayList<String>();
	public static String find_king_status(String pieces) {
		String[] piece = pieces.split(" ");
		String king = "";
		for(int i = 0; i < piece.length; i++) {
			char p = piece[i].charAt(0);
			if(p == 'Q') queen(((int)piece[i].charAt(1))-97, Integer.parseInt(piece[i].charAt(2) + "")-1);
			else if(p == 'B') bishop(((int)piece[i].charAt(1))-97, Integer.parseInt(piece[i].charAt(2) + "")-1);
			else if(p == 'P') pawn(((int)piece[i].charAt(1))-97, Integer.parseInt(piece[i].charAt(2) + "")-1);
			else if(p == 'R') rook(((int)piece[i].charAt(1))-97, Integer.parseInt(piece[i].charAt(2) + "")-1);
			else if(p == 'N') knight(((int)piece[i].charAt(1))-97, Integer.parseInt(piece[i].charAt(2) + "")-1);
			else {
				king = piece[i];
			}
		}
		for(int i = 7; i >=0; i--) {
			String temp = "";
			for(int j = 0; j < 8; j++) {
				temp+=board[i][j];
			}
			//System.out.println(temp);
		}
		
		//go(5, 5);
		int k1 = ((int)king.charAt(1))-97;
		int k2 = Integer.parseInt(king.charAt(2) + "")-1;
		boolean check = false;
		if(board[k1][k2] == 1) {
			check = true;
		}
		if(check && !go(k1, k2)) {
			return "CHECKMATE";
		} else if(check && go(k1, k2)) {
			return "CHECK";
		} else if(!check && !go(k1, k2)) {
			return "STALEMATE";
		} else {
			return "SAFE";
		}
    }
	public static void queen(int i, int j) {
		for(int l = 1; l < 8; l++) {
			if(check(i+l, j+l)) {
				board[i+l][j+l] = 1;
			}
			if(check(i+l, j-l)) {
				board[i+l][j-l] = 1;
			}
			if(check(i-l, j+l)) {
				board[i-l][j+l] = 1;
			}
			if(check(i-l, j-l)) {
				board[i-l][j-l] = 1;
			}
		}
		for(int l = 0; l < 8; l++) {
			//System.out.println(i + " " + l);
			//System.out.println(l + " " + j);
			board[i][l] = 1;
			board[l][j] = 1;
		}
		board[i][j] = 0;
	}
	public static void bishop(int i, int j) {
		for(int l = 1; l < 8; l++) {
			if(check(i+l, j+l)) {
				board[i+l][j+l] = 1;
			}
			if(check(i+l, j-l)) {
				board[i+l][j-l] = 1;
			}
			if(check(i-l, j+l)) {
				board[i-l][j+l] = 1;
			}
			if(check(i-l, j-l)) {
				board[i-l][j-l] = 1;
			}
		}
		
	}
	public static void pawn(int i, int j) {
		if(check(i+1, j+1)) {
			board[i+1][j+1] = 1;
		} 
		if(check(i-1, j+1)) {
			board[i-1][j+1] = 1; 
		}
	}
	public static void rook(int i, int j) {
		for(int l = 0; l < 8; l++) {
			//System.out.println(i + " " + l);
			//System.out.println(l + " " + j);
			board[i][l] = 1;
			board[l][j] = 1;
		}
		board[i][j] = 0;
	}
	public static void knight(int i, int j) {
		int[] i1 = {-2, 2};
		int[] i2 = {-1, 1};
		for(int l:i1) {
			for(int k:i2) {
				if(check(i+l,j+k)) board[i+l][j+k] = 1;
				//System.out.println((i+l) + " " + (j+k));
				//System.out.println((i+k) + " " + (j+l));
				
				if(check(i+k,j+l)) board[i+k][j+l] = 1;
			}
		}
	}
	public static boolean check(int i, int j) {
		if(i < 0 || j < 0 || i >= 8 ||j >= 8) {
			return false;
		}
		return true;
	}
	public static boolean go(int i, int j) {
		int[] i1 = {0, -1, 1};
		for(int l:i1) {
			for(int k:i1) {
				if(l == 0 && k ==0) {
					continue;
				}
				//System.out.println((l+i) + " " +  (k+j));
				if(check(i+l, j+k)) {
					if(board[i+l][j+k] == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void blocking() {
		
	}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        String pieces = bufferedReader.readLine();

        String result = find_king_status(pieces);

        System.out.println(result);
    }
}
