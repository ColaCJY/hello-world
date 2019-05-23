package demo3;

public class Father implements Observer{
	Student stu;
	public void criticism() {
		if (stu.getScore()<60) {
			System.out.println("ÅúÆÀ");
		}else {
			System.out.println("ºÃ");
		}
	}
}
