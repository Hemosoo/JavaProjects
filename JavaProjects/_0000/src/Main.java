import java.util.*;
import java.io.*;
public class Main {
	
    public static void main(String[] args) throws IOException {
    	String[] strs = {"a", "ab"};
    	System.out.println(longestCommonPrefix(strs));
        
    }
    public static String longestCommonPrefix(String[] strs) {
        String l = strs[0];
        int ind = strs[0].length();
        for(int i = 0;i<strs.length; i++) {
            if(ind > strs[i].length()) {
                ind = strs[i].length();
                l = strs[i];
            }
        }
        String prev = "";
        /*if(ind == 1) {
        	for(int j = 0; j < strs.length; j++) {
                if(!strs[j].substring(0, 1).equals(l)) {
                    return l;
                }
            }
        }*/
        for(int i = 0; i <= l.length(); i++) {
            String sub = l.substring(0, i);
            for(int j = 0; j < strs.length; j++) {
                if(!strs[j].substring(0, i).equals(sub)) {
                    return prev;
                }
            }
            prev = sub;
        }
        return prev;
    }
}