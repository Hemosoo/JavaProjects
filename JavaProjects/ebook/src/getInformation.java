import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class getInformation {
	int a, b;
	public static void main(String[] args) throws IOException {
		 System.out.println(getInfo("C:\\Users\\Hemosoo Woo\\Downloads\\01_124902.zip"));
		        
		   
	}
	public static String getInfo(String filepath) throws IOException {
		ZipFile zipFile = new ZipFile(filepath);

	    Enumeration<? extends ZipEntry> entries = zipFile.entries();
	    StringBuilder sb = new StringBuilder();
	    while(entries.hasMoreElements()){
	        ZipEntry entry = entries.nextElement();
	        InputStream stream = zipFile.getInputStream(entry);
	        if(entry.getName().equals("index_split_000.html")) {
	        	InputStreamReader isReader = new InputStreamReader(stream);
		        //Creating a BufferedReader object
		        BufferedReader reader = new BufferedReader(isReader);
		        String str;
		        while((str = reader.readLine())!= null){
		           for(int j = 0; j < str.length(); j++) {
		        	   if(str.charAt(j) == '>' && j < str.length()-9) {
		        		   if(str.substring(j+1, j+6).equals("Title")) {
		        			   int beg = 0;
		        			   int end = 0;
		        			   for(int i = 0; i < str.length(); i++) {
		        				   if(str.charAt(i) == ':') {
		        					   beg = i+1;
		        				   } else if(str.charAt(i) == '<' && i != 0) {
		        					   end = i;
		        				   }
		        			   }
		        			   sb.append("Title:" + str.substring(beg, end).replaceAll("\\s+", " ") + "\n");
		        		   } else if(str.substring(j+1, j+7).equals("Author")) {
		        			   int beg = 0;
		        			   int end = 0;
		        			   for(int i = 0; i < str.length(); i++) {
		        				   if(str.charAt(i) == ':') {
		        					   beg = i+1;
		        				   } else if(str.charAt(i) == '<' && i != 0) {
		        					   end = i;
		        				   }
		        			   }
		        			   sb.append("Author:" + str.substring(beg, end).replaceAll("\\s+", " ")+ "\n");
		        		   } else if(str.substring(j+1, j+9).equals("Language")) {
		        			   int beg = 0;
		        			   int end = 0;
		        			   for(int i = 0; i < str.length(); i++) {
		        				   if(str.charAt(i) == ':') {
		        					   beg = i+1;
		        				   } else if(str.charAt(i) == '<' && i != 0) {
		        					   end = i;
		        				   }
		        			   }
		        			   sb.append("Language:" + str.substring(beg, end).replaceAll("\\s+", " ")+ "\n");
		        		   }
		        	   }
		           }
		        }
		        //System.out.println(sb.toString());
		        isReader.close();
	        }
	        
	    }
	    
        return sb.toString();
	}
}
