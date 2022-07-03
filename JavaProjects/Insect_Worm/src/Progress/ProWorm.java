package Progress;

import Base.Worm;
import Interface.ProAct;
import Interface.ProWeapon;

public class ProWorm extends Worm implements ProAct, ProWeapon {
	private int speed, force;
	private String proweapon;
	public ProWorm(String n, String t, String w, String m, boolean leg, int s, int f, String pro) {
		super(n, t, w, m, leg);
		// TODO Auto-generated constructor stub
		speed = s;
		force = f;
		proweapon = pro;
	}
	public String toString() {
		return super.toString() + " [Speed] " + speed + " [Force] " + force + " [Proweapon] " + proweapon;
	}
	@Override
	public String preWeapon() {
		// TODO Auto-generated method stub
		return proweapon;
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
