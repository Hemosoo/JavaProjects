package Base;

public abstract class Character {
	private String name;
	private String type;
	
	public Character(String n, String t) {
		name = n;
		type = t;
	}
	
	public String getName() {
		return name;
	}
	
	protected void setName(String n) {
		name = n;
	}
	
	public String toString() {
		return "[Name] " + name + " [Type] " + type;
	}
	
	abstract String Weapon();
	
	abstract String Move();
}

