package project.species;

import java.util.Random;
import java.util.Timer;
import project.Cordinates;

public class Dermathogides extends AMite implements IMite {
	
	Random rnd = new Random();
	
	public Dermathogides (Cordinates cordinates) {
		this.cordinates = new Cordinates(cordinates);
		this.type = 8;
		setHealth(rnd.nextInt(10) + 10);
		setDirection(rnd.nextInt(10));
		
		this.fertility = 2; // species differentiation factor
		this.speed = 6;
		this.strength = 8;
		
		ovulation = new OvulationCycle();
		Timer timer = new Timer();
		timer.schedule(ovulation, fertility*4*1000, fertility*4*1000);
		
	}

	@Override
	public Cordinates move() {
		
		Cordinates crd = new Cordinates (cordinates);
		
		if (rnd.nextInt(5)%4 == 0) {
			setDirection(rnd.nextInt(10));
		}
		
		int k = rnd.nextInt(3);
	
		switch (getDirection() ) {
			case 1: {
				crd.modCordinates(-1*k, -1*k);
				break;
			}	
			case 2:
				crd.modCordinates(-1*k, 0*k);
				break;
			case 3:
				crd.modCordinates(-1*k, 1*k);
				break;
			case 4:
				crd.modCordinates(0*k, -1*k);
				break;
			case 5:
				crd.modCordinates(0*k, 0*k);
				break;
			case 6:
				crd.modCordinates(0*k, 1*k);
				break;
			case 7:
				crd.modCordinates(1*k, -1*k);
				break;
			case 8:
				crd.modCordinates(1*k, 0*k);
				break;
			case 9:
				crd.modCordinates(1*k, 1*k);
				break;
				
			default: {
				crd.modCordinates(0*k, 0*k);
				break;
				}
		}
		//this.setHealth(-1);
		return crd;
	}
	public void attack(IMite enemy) {
		enemy.setHealth(-this.strength);
	}


}
