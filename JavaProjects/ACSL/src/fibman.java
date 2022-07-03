import java.util.*;
import java.io.*;
public class fibman {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d1 = in.nextDouble();
		double d2 = in.nextDouble();
		System.out.println(cycleLength(d1, d2));
		System.out.println(cycleLength2(d1, d2));
		System.out.println(round2(-3.075,2));
		//System.out.println(Math.round(-5.055*100)/100d);
		//System.out.println(Math.round(5.055*100)/100d);
	}
	/*
	public static String cycleLength(float realPartC, float imagPartC) {
		
        ArrayList<Double> res1 = new ArrayList<Double>();
        ArrayList<Double> res2 = new ArrayList<Double>();
        res1.add(Double.valueOf(((Float)realPartC).toString()));
        res2.add(Double.valueOf(((Float)imagPartC).toString()));
        double p1 = realPartC;
        double p2 = imagPartC;
        double c1 = 0;
        double c2 = 0;
        int cnt = 1;
        
        while(true) {
        	cnt++;
        	c1 = (p1*p1 + -1*p2*p2 + realPartC);
        	c2 = (2*p1*p2 + imagPartC);
        	if(c1 < 0) {
        		c1 = Math.round(c1*-100)/100d * -1;
        	} else {
        		c1 = Math.round(c1*100)/100d;
        	}
        	if(c2 < 0) {
        		c2 = Math.round(c2*-100)/100d * -1;
        	} else {
        		c2 = Math.round(c2*100)/100d;
        	}
        	//System.out.println(c1 + " + " + c2 + "i");
        	double abs = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        	if(abs > 4){
        		System.out.println(res1);
    			System.out.println(res2);
        		return "ESCAPES " + (cnt);
        	}
        	if(res1.contains(c1) && res2.contains(c2)) {
        		System.out.println(res1);
    			System.out.println(res2);
        			return cnt-res1.indexOf(c1)-1+"";
        		
        		
        	} 
        	res1.add(c1);
        	res2.add(c2);
        	p1=c1;
        	p2=c2;
        	
        }
    }
    */
	
	static double round(double a) {
            a =  (Math.round(a*100)/100d);
        return a;
    }
    
    public static String cycleLength(double realPartC, double imagPartC) {
        
        ArrayList<Double> res1 = new ArrayList<Double>();
        ArrayList<Double> res2 = new ArrayList<Double>();
        realPartC = round(realPartC);
        imagPartC = round(imagPartC);
        double p1 = realPartC;
        double p2 = imagPartC;
        
        res1.add(p1);
        res2.add(p2);
        double c1 = 0;
        double c2 = 0;
        int cnt = 1;
        while(true) {
            cnt++;
            c1 = round(p1*p1 + -1*p2*p2 + realPartC);
            c2 = round(2*p1*p2 + imagPartC);
            //System.out.println(c1 + " + " + c2 + "i");
           // if(p1 == c1 && p2 == c2) return cnt-1 + "";
            System.out.println("(" + c1 + "+" + c2 + "i)^2 + (" + realPartC + "+" + imagPartC + "i) = " + c1 + "+" + c2 + "i");
            double abs = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
            if(res1.contains(c1) && res2.contains((c2)) && res1.indexOf(c1) == res2.indexOf(c2)) {
                System.out.println(res1);
                System.out.println(res2);
                return cnt-res1.indexOf(c1)-1+"";
                
                
            } if(abs > 4){
                System.out.println(res1);
                System.out.println(res2);
                return "ESCAPES " + (cnt);
            }
            if(cnt == 500) {
                System.out.println(res1);
                System.out.println(res2);
                return "1";
            }
            res1.add((c1));
            res2.add((c2));
            p1=c1;
            p2=c2;
            
        }
    }
    public static double round2(double value, int scale) {
        int pow = 10;
        for(int i = 1; i < scale; i++) {
            pow *= 10;
        }
        
        double tmp = value*pow;
        double tmpSub = tmp-(int) tmp;
        return ((double)((int) (
            value >= 0
            ? (tmpSub >= 0.5f ? tmp +1 : tmp) 
            : (tmpSub >= -0.5f ? tmp : tmp - 1)
            ) ) ) / pow;
    }
    public static String cycleLength2(double realPartC, double imagPartC) {
        double realPartZ = 0;
        double imagPartZ = 0;
        
        realPartC = round2(realPartC, 2);
        imagPartC = round2(imagPartC, 2);
    
        double tempRealC = realPartC;
        double tempImagC = imagPartC;    
        boolean cond = true;
        int count = 0;
        ArrayList<Double> realC = new ArrayList<Double>();
        ArrayList<Double> imagC = new ArrayList<Double>();
        
        while(cond) {
            realC.add(tempRealC);
            imagC.add(tempImagC);
            
            tempRealC = round2((realPartZ*realPartZ)-(imagPartZ*imagPartZ)+realPartC, 2);
            tempImagC = round2((2*realPartZ*imagPartZ)+(imagPartC), 2);
            
            //System.out.println((realPartZ*realPartZ)-(imagPartZ*imagPartZ)+realPartC);
            //System.out.println(round((realPartZ*realPartZ)-(imagPartZ*imagPartZ)+realPartC, 2));
            //System.out.println((2*realPartZ*imagPartZ)+(imagPartC));
            //System.out.println(round((2*realPartZ*imagPartZ)+(imagPartC), 2));
            System.out.println("(" + realPartZ + "+" + imagPartZ + "i)^2 + (" + realPartC + "+" + imagPartC + "i) = " + tempRealC + "+" + tempImagC + "i");
        
            realPartZ = tempRealC;
            imagPartZ = tempImagC;
            count++;
            
            if(tempRealC == realPartC && tempImagC == imagPartC && count != 1) {
                return Integer.toString(count-1);
            }
            
            if(realC.contains(tempRealC) && imagC.contains(tempImagC) && count != 1) {
                return "" + (count-realC.indexOf(tempRealC));
            }
            
            
            if(tempRealC*tempRealC + tempImagC*tempImagC > 16) {
                return "ESCAPES " + (count);
            }
            if(count == 500) cond = false;
        }
        return Integer.toString(count);
        
        
    }
    
    
}
