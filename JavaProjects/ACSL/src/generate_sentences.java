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




public class generate_sentences {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String sentences = bufferedReader.readLine();

        String result = generate_sentences(dictionary, sentences);

        System.out.println((result));

        bufferedReader.close();
    }
    public static String generate_sentences(List<String> dictionary, String sentences) {
    	//System.out.println(dictionary);
    	//System.out.println(sentences);
    	HashMap<String, String[]> map = new HashMap<String, String[]>();
    	
    	for(int i = 0; i < dictionary.size(); i++) {
    		String[] temp = dictionary.get(i).split(" ");
    		map.put(temp[0], temp);
    	}
    	//System.out.println(Arrays.toString(map.get("P")));
    	HashMap<String, Integer> ind = new HashMap<String, Integer>();
    	for(String i:map.keySet()) {
    		ind.put(i, 1);
    	}
    	//System.out.println(ind);
    	String ans = "";
    	String[] sent = sentences.split(" ");
    	for(int i = 0; i < sent.length; i++) {
    		String tsent = "";
    		String type = "";
    		boolean a = false;
    		for(int j = 0; j < sent[i].length(); j++) {
    			String c = sent[i].charAt(j)+"";
    			if(j ==0) {
    				type = c;
    				
    			} else if(c.equals("A")) {
    				
    				tsent+="a";
    				a = true;
    			} else if(c.equals("T")) {
    				tsent+="the ";
    			} else {
    				if(a) {
    					if(isVowel(map.get(c)[ind.get(c)].charAt(0))) {
    						tsent+="n ";
    					} else {
    						tsent+=" ";
    					}
    					a = false;
    				}
    				if(ind.get(c) > map.get(c).length-1) {
    					ind.put(c, 1);
    				}
    				tsent+=map.get(c)[ind.get(c)] + " ";
    				if(ind.get(c)-1 == map.get(c).length) {
    					
    				} else ind.put(c, ind.get(c)+1);
    				
    			}
    		}
    		tsent = tsent.substring(0, tsent.length()-1);
    		if(type.equals("D") || type.equals("I")) {
    			tsent = tsent.substring(0, 1).toUpperCase() + tsent.substring(1) + ".";
    		} else if(type.equals("E")) {
    			tsent = tsent.substring(0, 1).toUpperCase() + tsent.substring(1) + "!";
    		} else {
    			tsent = "What " + tsent+ "?";
    		}
    		
    		
    		ans+=tsent + " ";
    	}
    	
    	return ans.substring(0, ans.length()-1);
    }
    public static boolean isVowel(char c) {
    	if(c == 'a' || c == 'e' || c=='i' || c == 'o' || c =='u') {
    		return true;
    	}
    	return false;
    }
}
