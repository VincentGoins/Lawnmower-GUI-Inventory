package _20Fall;

public abstract class WalkBehindMower extends Mower{

	private double cutWidth;
	private double wheelDiameter;
	


	public WalkBehindMower() {
	cutWidth = 0;
	wheelDiameter = 0;
	}
	
	public void setCutWidth(double cutWidth){
		this.cutWidth = cutWidth;
	}
	public double getCutWidth() {
		return cutWidth;
	}
	
	public double getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	public String toString() {
		return String.format(cutWidth + "%n" + wheelDiameter);
}
	
}
