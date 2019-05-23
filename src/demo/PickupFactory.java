package demo;

public class PickupFactory implements AutoFactory{
	@Override
	public Auto getAuto(String msg) {
		Pickup pk=new Pickup();
		pk.color=msg;
		return pk;
	}
}
