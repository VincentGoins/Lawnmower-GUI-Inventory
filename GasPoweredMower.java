package _20Fall;

public class GasPoweredMower extends WalkBehindMower{
	private Engine engine;
	private boolean selfPropelled;
	
	
	public GasPoweredMower() {
		engine = new Engine();
		selfPropelled = true;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public boolean isSelfPropelled() {
		return selfPropelled;
	}


	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}
	
	public String toString() {
		return String.format(engine + "%n" + selfPropelled);
	}
}
