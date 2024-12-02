package _20Fall;

public class LawnTractor extends Mower{

	private Engine engine;
	private String model;
	private double deckWidth;
	
	public LawnTractor() {
		engine = new Engine();
		model = "none";
		deckWidth = 0;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getDeckWidth() {
		return deckWidth;
	}

	public void setDeckWidth(double deckWidth) {
		this.deckWidth = deckWidth;
	}
	
	public String toString() {
		return String.format(engine + "%n" + model + "%n" + deckWidth);	
	}
}
