package project;

public class Cordinates {
	private int x;
	private int y;
	
	Cordinates (int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	public Cordinates (Cordinates cordinates) {
		this.x  = cordinates.getX();
		this.y = cordinates.getY();
	}
	
	public boolean equals(Cordinates crd) {
		return (this.x == crd.getX() && this.y == crd.getY());
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Cordinates getCordinates() {
		return this;
	}
	
	public void modCordinates(int x, int y) {
		this.x += x;
		this.y += y;
	}
}
