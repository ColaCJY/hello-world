package demo;

public class Demo {
	public static void main(String[] args) {
		FactorySelector fs=new FactorySelector();
		AutoFactory f=fs.getAutoFactory("����");
		Auto a=f.getAuto("��");
		a.run();
		
//		AutoFactory f1=new CarFactory();
//		Auto a1=f1.getAuto("�ϰ�");
//		
//		AutoFactory f2=new PickupFactory();
//		Auto a2=f2.getAuto("����");
	}
}
