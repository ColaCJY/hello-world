package demo;

public class CarFactory implements AutoFactory{
	
	@Override
	public Auto getAuto(String msg) {
		if (msg.equals("�ϰ�")) {
			return new Car();
		}else if (msg.equals("����")) {
			return new SUV();
		}else {
			return null;
		}
	}
}
