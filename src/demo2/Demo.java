package demo2;

public class Demo {
	public static void main(String[] args) {
//		Car c=new Car("��");
//		c.run();
//		ͨ�������ߣ������ӵĽ�����̴Ӷ�������ȡ����
//		CarBuilder cb=new CarBuilder();
//		Car c2=cb.getCar("��");
		
		letCarRun(new MyCar());
	}
	public static void letCarRun(Car c) {
		c.run();
	}
}
