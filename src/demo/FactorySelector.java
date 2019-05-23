package demo;

public class FactorySelector {
	AutoFactory getAutoFactory(String msg) {
		if (msg.equals("上班")) {
			return new CarFactory();
		}else if (msg.equals("旅游")) {
			return new CarFactory();
		}else if (msg.equals("拉货")) {
			return new PickupFactory();
		}else {
			return null;
		}
	}
}
