package project.species;
import project.Cordinates;

public abstract class AMite {
	int type; // char type ?
	private int direction; // ENUM ? might be 1-9 avalible directions
	// can be mood by user maybe but not now
	private int health;
	int strength;
	int speed;
	int fertility;

	OvulationCycle ovulation;
	Cordinates cordinates;
	
	public Cordinates getCordinates() {
		return cordinates;
	}
	
	public boolean layEggAbility() {
		return ovulation.layEggAbility();
	}
	
	public boolean isStarved() {
		return (health <=0);
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getType() {
		return type;
	}
	
	public void setHealth(int vital) { // primitive way to loos health for now
		health += vital; 
	}
	
	public void layEgg() {
		ovulation.resetCycle();
	}
	
	public void eat() {
		health += 10; // in the future colaboration with map maybe
	}
	int getDirection() {
		return direction;
	}
	
	void setDirection(int direction) {
		this.direction = direction;
	}
	
}	
