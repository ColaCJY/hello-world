package demo;

public class CarFactory implements AutoFactory{
	
	@Override
	public Auto getAuto(String msg) {
		if (msg.equals("…œ∞‡")) {
			return new Car();
		}else if (msg.equals("¬√”Œ")) {
			return new SUV();
		}else {
			return null;
		}
	}
}
