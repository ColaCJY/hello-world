package demo3;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int score;
	private List<Observer> OList=new ArrayList<>();
	public void setObserver(Observer observer) {
		OList.add(observer);
	} 
	public int getScore() {
		return score;
	}
/**
 * ¸úÐÂ
 * @param score
 */
	public void setScore(int score) {
		this.score = score;
		for(Observer observer:OList) {
			observer.criticism();
		}
	}
	
}
