package demo3;

public class Mother implements Observer{
	Student stu;
	public void criticism() {
		if (stu.getScore()<70) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
	}
}
