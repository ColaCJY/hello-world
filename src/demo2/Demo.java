package demo2;

public class Demo {
	public static void main(String[] args) {
//		Car c=new Car("黄");
//		c.run();
//		通过建造者，将复杂的建造过程从对象中提取出来
//		CarBuilder cb=new CarBuilder();
//		Car c2=cb.getCar("红");
		
		letCarRun(new MyCar());
	}
	public static void letCarRun(Car c) {
		c.run();
	}
}
