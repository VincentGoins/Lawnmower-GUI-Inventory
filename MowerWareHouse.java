package _20Fall;

import java.util.*;
import java.io.*;
public class MowerWareHouse{
	
	 
	private String storeName;
	private ArrayList<Mower> mowers;
	public LawnTractor lawn;
	public CommercialMower commercial;
	public GasPoweredMower gas;
	public PushReelMower push;
	private ArrayList<String> mowerType;
	private ArrayList<String> lawnList;
	private ArrayList<String> commercialList;
	private ArrayList<String> gasList;
	private ArrayList<String> pushList;	
	
	public MowerWareHouse() {
		storeName = "none";
		mowers = new ArrayList<Mower>();
		mowerType = new ArrayList<String>();
		lawnList = new ArrayList<String>();
		commercialList = new ArrayList<String>();
		gasList = new ArrayList<String>();
		pushList = new  ArrayList<String>();
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public int getNumMowers() {
		return mowers.size();
	}
	
	public Mower getMowers(int index) {
		return mowers.get(index);
	}
	public void setMowers(int index, Mower item) {
		mowers.set(index, item);
	}
	public void addMowers(Mower item) {
		mowers.add(item);
	}
	public Mower removeMowers(int index) {
		return mowers.remove(index);
	}
	
	public int getNumLawn() {
		return lawnList.size();
	}
	
	public String getLawn(int index) {
		return lawnList.get(index);
	}
	public void setLawn(int index, String item) {
		lawnList.set(index, item);
	}
	public void addLawn(String item) {
		lawnList.add(item);
	}
	public String removeLawn(int index) {
		return lawnList.remove(index);
	}
	
	public int getNumCommercial() {
		return commercialList.size();
	}
	
	public String getCommercial(int index) {
		return commercialList.get(index);
	}
	public void setCommercial(int index, String item) {
		commercialList.set(index, item);
	}
	public void addCommercial(String item) {
		commercialList.add(item);
	}
	public String removeCommercial(int index) {
		return commercialList.remove(index);
	}
	
	public int getNumGas() {
		return gasList.size();
	}
	
	public String getGas(int index) {
		return gasList.get(index);
	}
	public void setGas(int index, String item) {
		gasList.set(index, item);
	}
	public void addGas(String item) {
		gasList.add(item);
	}
	public String removeGas(int index) {
		return gasList.remove(index);
	}
	
	public int getNumPush() {
		return pushList.size();
	}
	
	public String getPush(int index) {
		return pushList.get(index);
	}
	public void setPush(int index, String item) {
		pushList.set(index, item);
	}
	public void addPush(String item) {
		pushList.add(item);
	}
	public String removePush(int index) {
		return pushList.remove(index);
	}
	
	
	public void readMowerData(String inputFileName) throws IOException {
		FileInputStream file = new FileInputStream(inputFileName);
		Scanner scnr = new Scanner(file);
		
		this.setStoreName(scnr.nextLine());
		
	
		while(scnr.hasNext()) {
			
		String mowerType = scnr.nextLine();
		this.mowerType.add(mowerType);
		
		switch(mowerType) {
		case "L":
			lawn = new LawnTractor();
			Engine engine = new Engine();
			engine.setManufacturer(scnr.nextLine());
			engine.setHorsePower(scnr.nextDouble());
			engine.setCylinders(scnr.nextInt());
			lawn.setEngine(engine);
			
			scnr.nextLine();
			lawn.setModel(scnr.nextLine());
			lawn.setDeckWidth(scnr.nextDouble());
		
		
			scnr.nextLine();
			lawn.setManufacturer(scnr.nextLine());
			lawn.setYear(scnr.nextInt());
			scnr.nextLine();
			lawn.setSerialNumber(scnr.nextLine());
			this.addLawn(String.format(lawn.toString() + "%n" + lawn.getManufacturer() + "%n" + lawn.getYear() + "%n" + lawn.getSerialNumber() ));
			
			
			
		
		break;
		
		case "C":
			commercial = new CommercialMower();
			engine = new Engine();
			engine.setManufacturer(scnr.nextLine());
			engine.setHorsePower(scnr.nextDouble());
			engine.setCylinders(scnr.nextInt());
			commercial.setEngine(engine);
			scnr.nextLine();
			commercial.setModel(scnr.nextLine());
			commercial.setDeckWidth(scnr.nextDouble());
			commercial.setOperatingHours(scnr.nextDouble());
			commercial.setZeroTurnRadius(scnr.nextBoolean());
			scnr.nextLine();
			commercial.setManufacturer(scnr.nextLine());
			commercial.setYear(scnr.nextInt());
			scnr.nextLine();
			commercial.setSerialNumber(scnr.nextLine());
			this.addCommercial(String.format(commercial.getEngine() + "%n" + commercial.getModel() + "%n" + commercial.getDeckWidth() + "%n" + commercial.toString() 
			+ "%n" + commercial.getManufacturer() + "%n" + commercial.getYear() + "%n" + commercial.getSerialNumber()) );
		break;
		
		case "G":
			gas = new GasPoweredMower();
			gas.setCutWidth(scnr.nextDouble());
			gas.setWheelDiameter(scnr.nextDouble());
			engine = new Engine();
			scnr.nextLine();
			engine.setManufacturer(scnr.nextLine());
			engine.setHorsePower(scnr.nextDouble());
			engine.setCylinders(scnr.nextInt());
			gas.setEngine(engine);
			gas.setSelfPropelled(scnr.nextBoolean());
			scnr.nextLine();
			gas.setManufacturer(scnr.nextLine());
			gas.setYear(scnr.nextInt());
			scnr.nextLine();
			gas.setSerialNumber(scnr.nextLine());
			this.addGas(String.format(gas.getCutWidth() + "%n" + gas.getWheelDiameter() + "%n" + gas.toString() + "%n" + gas.getManufacturer() + "%n" 
			+ gas.getYear() + "%n" + gas.getSerialNumber()));
		break;
		
		case "P":
			push = new PushReelMower();
			push.setCutWidth(scnr.nextDouble());
			push.setWheelDiameter(scnr.nextDouble());
			push.setNumWheels(scnr.nextInt());
			scnr.nextLine();
			push.setManufacturer(scnr.nextLine());
			push.setYear(scnr.nextInt());
			scnr.nextLine();
			push.setSerialNumber(scnr.nextLine());
			this.addPush(String.format(push.getCutWidth() + "%n" + push.getWheelDiameter() + "%n" + push.toString() + "%n" + push.getManufacturer() + "%n" 
					+ push.getYear() + "%n" + push.getSerialNumber()));
		}
		}
	}
	
	
	public void saveMowerData(String outputFileName)throws IOException {
		
		FileOutputStream file = new FileOutputStream(outputFileName);
		PrintWriter print = new PrintWriter(file);
		int l = 0;
		int c = 0;
		int g = 0;
		int p = 0;
		print.println(this.getStoreName());
		
		
		for(int i = 0; i < mowerType.size(); i++) {
		if(mowerType.get(i).equals("L")) {
			print.println(this.mowerType.get(i));
			print.println(this.getLawn(l));
			l++;
		}
		if(mowerType.get(i).equals("C")) {
			
			print.println(this.mowerType.get(i));
			print.println(this.getCommercial(c));
			c++;
		}
		if(mowerType.get(i).equals("G")) {
			print.println(this.mowerType.get(i));
			print.println(this.getGas(g));
			g++;
		}
		
		if(mowerType.get(i).equals("P")) {
			print.println(this.mowerType.get(i));
			print.println(this.getPush(p));
			p++;
		}
		}
		print.close();
	}
	
	public String toString() {
		String outputString = String.format(storeName + "%n");
		int l = 0;
		int c = 0;
		int g = 0;
		int p = 0;
		for(int i = 0; i < mowerType.size(); i++) {
			if(mowerType.get(i).equals("L")) {
			
		 outputString = outputString.concat(String.format(mowerType.get(i) + "%n" + this.getLawn(l) + "%n"));
		 l++;
			}
			
			if(mowerType.get(i).equals("C")) {
			outputString = outputString.concat(String.format(mowerType.get(i) + "%n" + this.getCommercial(c) + "%n"));
			c++;
			}
			
			if(mowerType.get(i).equals("G")) {
			outputString = outputString.concat(String.format(mowerType.get(i) + "%n" + this.getGas(g) + "%n"));
			g++;
			}
			
			if(mowerType.get(i).equals("P")) {
				outputString = outputString.concat(String.format(mowerType.get(i) + "%n" + this.getPush(p) + "%n"));
				p++;
				}
		}
		return outputString;
	}
}
