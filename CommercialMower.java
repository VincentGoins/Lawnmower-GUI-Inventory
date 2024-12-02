  package _20Fall;

public class CommercialMower extends LawnTractor{

	private double operatingHours;
	private boolean zeroTurnRadius;
	
	public CommercialMower() {
		operatingHours = 0;
		zeroTurnRadius = true;
	}

	public double getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(double operatingHours) {
		this.operatingHours = operatingHours;
	}

	public boolean isZeroTurnRadius() {
		return zeroTurnRadius;
	}

	public void setZeroTurnRadius(boolean zeroTurnRadius) {
		this.zeroTurnRadius = zeroTurnRadius;
	}
	
	public String toString() {
		return String.format(operatingHours + "%n" + zeroTurnRadius);
	}
}
