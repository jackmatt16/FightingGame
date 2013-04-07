package object;

import java.awt.Dimension;
import util.Location;
import util.Pixmap;

public class CharacterObject extends GameObject implements Damageable {
	private static final int DEFAULT_HEALTH=10; 
	private int myHealth=DEFAULT_HEALTH;
	public CharacterObject(Pixmap image, Location center, Dimension size) {
		super(image, center, size);
		// TODO Auto-generated constructor stub
	}
	
	public CharacterObject(Pixmap image, Location center, Dimension size, int health) {
		super(image, center, size);
		myHealth= health; 
		// TODO Auto-generated constructor stub
	}

    
	@Override
	public boolean isDestroyed() {
		return myHealth<=0;
		
	}


}
