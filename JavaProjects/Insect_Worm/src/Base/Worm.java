package Base;

public class Worm extends Character {
	private String weapon;
	private String move;
	private boolean leg;
	
	public Worm(String n, String t, String w, String m, boolean leg) {
		super(n, t);
		weapon = w;
		move = m;
		this.leg = leg;
	}
	
	public String getWeapon() { return weapon; }
	public String getMove() { return move; }
	public boolean getLeg() { return leg; }
	
	public void setWeapon(String w) { weapon=w; }
	public void setMove(String m) { move = m; }
	public void setLeg(boolean l) { leg = l; }
	
	public String toString() {
		return super.toString() + " [Weapon] " + weapon + " [Move] " + move + " [Leg] " + leg;
	}

	@Override
	String Weapon() {
		// TODO Auto-generated method stub
		return weapon;
	}

	@Override
	String Move() {
		// TODO Auto-generated method stub
		return move;
	}
}
