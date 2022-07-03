import java.util.Scanner;
import java.io.*;
public class prob14 {
	static Scanner in;
	static String p1;
	static boolean so, leave,ch, nch;
	static String[] phrasen={" Hey..", " we meeting up tonight?", " oh.", " yup.", " K.", " good for you", " I always love this story"," ha."," can we call instead?", " You okay???", " ...", " have fun.", " Its fine", " k.", " yup", " <3", " so,,,", " Can I let you know?", " lol jk", " sure- i guess.", " If you really want to"};
	static String[] transn = {" Pay attention to me. Right now.", " I have nothing better to do, you free?", " okay", " yes and I am not happy with you", " Very well, but I am annoyed with you.", " I am partially jealous, and partially annoyed by your bragging.", " Stop telling me variations of this same story, or I'm shaving your dog and painting him green."," That was not funny."," It is going to take me too long to type this out.", " You're either late, not responding, or just generally being a jerk Knock it off.", " I am annoyed you are not responding faster.", " I am annoyed you didn't invite me.", " It's not fine"," That's not okay.", " Okay, I agree, but I'm not happy", " I approve", " I broke/lost/forgot something important to you, and I am about to lie about it.", " I have no idea, need to research an answer first.", " I am a jerk who tries to pretend my hurtful jokes aren't hurtful.", " I am angry now.", " I am trying to come up with a reason not to, but I've got nothing"};
	static String[] phrasey = {" we meeting up tonight?", " oh.", " ha.", " can we call instead?", " You okay?"," ....", " have fun.", " <3u", " so,,,"};
	static String[] transy = {" I want to go out.", " I am not happy about your last message.", " You get a pity laugh, because I <3 u", " I am angry enough that I want to yell at you.", " Worried about you.", " I am too busy to respond right now, but I am dating you, so here's some ellipses.", " Do not do that if you want to stay in a relationship with me."," I love you", " I am about to start an incredibly long/complex story, which you have to listen to, because you love me."};
	public static void main(String[] args) {
		try{
			in = new Scanner(System.in);
			so=false;
			leave=false;
			p1 = in.nextLine();
			String tmp = in.nextLine();
			if(tmp.equals("YES")) {
				so = true;
			}
		//	System.out.println(phrasen.length+ " " + transn.length);
		//	System.out.println(phrasey.length+ " " + transy.length);
			while (in.hasNext())
			{	
				
				init();
				if(leave)break;
				
			}
			in.close();
		}catch(Exception e){
			System. out.println("error: "+e.getMessage());
		}
	}

	static void init() {
		String c = p1+":";
		String name = in.next();
		if(name.equals("END")) {
			leave=true;
		}
		else if(name.equals(c)) {
			String rest = in.nextLine();
			System.out.println(name+ rest);
		}
		else {
			if(so) {
				String rest = in.nextLine();
				//System.out.println("rest: "+ rest);
				int ind = findInd(rest);
				if(ch) {
					System.out.println(name+transy[ind]);
				}
				else {
					System.out.println(name+transn[ind]);
				}
			}
			else {
				String rest = in.nextLine();
				int ind = findInd(rest);
				if(nch) {
					System.out.println(name+transn[ind]);
				}
				else {
					System.out.println(name+rest);
				}
			}
		}
		
	}

	private static int findInd(String rest) {
		int ind=0;
		ch=false;
		nch=false;
		if(so) {
			for(int i =0; i<phrasey.length; i++) {
				if(phrasey[i].equals(rest)) {
					ind = i;
					ch=true;
					break;
				}
			}
		}
		//System.out.println("check: " +ch);
		if(!ch) {
			for(int i =0; i<phrasen.length; i++) {
				if(phrasen[i].equals(rest)) {
					ind = i;
					nch=true;
					break;
				}
			}
		}
		//System.out.println("check: " + ch);
		return ind;
	}
	
}