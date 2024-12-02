package _20Fall;

public class PushReelMower extends WalkBehindMower{

	private int numWheels;
	
	public PushReelMower() {
		numWheels = 0;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public String toString() {
		return String.format(numWheels +"");
	}
}
