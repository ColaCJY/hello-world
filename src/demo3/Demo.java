package demo3;

public class Demo {
	public static void main(String[] args) {
		Student s=new Student();
		Mother m=new Mother();
		Father f=new Father();
		m.stu=s;
		f.stu=s;
		s.setObserver(m);
		s.setObserver(f);
		s.setScore(70);
		s.setScore(60);
	}
}
