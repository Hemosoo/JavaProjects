package Base;

public class Insect extends Character{
	private String weapon;
	private String move;
	private int wing;
	
	public Insect(String n, String t, String w, String m, int wing) {
		super(n, t);
		weapon = w;
		move = m;
		this.wing = wing;
	}
	
	public String getWeapon() { return weapon; }
	public String getMove() { return move; }
	public int getWing() { return wing; }
	
	public void setWeapon(String w) { weapon=w; }
	public void setMove(String m) { move = m; }
	public void setWing(int w) { wing = w; }
	
	public String toString() {
		return super.toString() + " [Weapon] " + weapon + " [Move] " + move + " [Wing] " + wing;
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
