package demo;

public class FactorySelector {
	AutoFactory getAutoFactory(String msg) {
		if (msg.equals("�ϰ�")) {
			return new CarFactory();
		}else if (msg.equals("����")) {
			return new CarFactory();
		}else if (msg.equals("����")) {
			return new PickupFactory();
		}else {
			return null;
		}
	}
}
