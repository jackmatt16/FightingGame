package object;

public interface Perishable {

	public boolean timedOut();
	public void stopTime();
	public void addTime(int amount);

}
