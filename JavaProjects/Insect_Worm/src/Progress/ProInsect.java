package Progress;

import Base.Insect;
import Interface.ProAct;

public class ProInsect extends Insect implements ProAct {
	private int speed;
	private int force;
	public ProInsect(String n, String t, String w, String m, int wing, int s, int f) {
		super(n, t, w, m, wing);
		speed = s;
		force = f;
		
		
	}
	public String toString() {
		return super.toString() + " [Speed] " + speed + " [Force] " + force;
	}
	@Override
	public int Speed() {
		// TODO Auto-generated method stub
		return speed;
	}
	@Override
	public int Force() {
		// TODO Auto-generated method stub
		return force;
	}
	
	
}
