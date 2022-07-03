package Tester;

import Base.Character;
import Base.Insect;
import Base.Worm;
public class Test1 {
	public static void main(String[] args) {
		Character c1 = new Insect("Pinko", "Insect", "Needle", "Fly", 4);
		
		System.out.println(c1);
		System.out.println(((Insect)c1).getWeapon());
		
		
		
		Worm w1 = new Worm("Lego", "Worm", "gun", "Jump", false);
		System.out.println(w1);
		
		System.out.println(c1.getName());
	}
}
