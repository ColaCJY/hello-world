package demo;

public class Demo {
	public static void main(String[] args) {
		FactorySelector fs=new FactorySelector();
		AutoFactory f=fs.getAutoFactory("拉货");
		Auto a=f.getAuto("黄");
		a.run();
		
//		AutoFactory f1=new CarFactory();
//		Auto a1=f1.getAuto("上班");
//		
//		AutoFactory f2=new PickupFactory();
//		Auto a2=f2.getAuto("旅游");
	}
}
