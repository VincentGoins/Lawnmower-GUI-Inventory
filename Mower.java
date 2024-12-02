package _20Fall;

public abstract class Mower {

	private String manufacturer;
	private int year;
	private String serialNumber;

	
	public Mower() {
		manufacturer = "none";
		year = 0;
		serialNumber = "none";
	}
	
	



	public Mower(String manufacturer, int year, String serialNumber) {
		super();
		this.manufacturer = manufacturer;
		this.year = year;
		this.serialNumber = serialNumber;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String toString() {
		return String.format(manufacturer + "%n" + year + "%n" + serialNumber);
	}
	
}
