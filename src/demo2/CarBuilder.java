package demo2;

public class CarBuilder {
	public Car getCar(String color) {
		Car c=new Car(color);
		c.color=color;
		return c;
	}
}
