package object;

public interface Damageable {
	public int getHealth(); 
	public void reduceHealth(int amount);
	public boolean isDestroyed();
}
