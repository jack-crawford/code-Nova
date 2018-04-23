import java.util.ArrayList;

public class DynamicQueue<T> {
	private ArrayList<T> q = new ArrayList<T>();
	private int front, back;
	public String printQueue() {
		String temp = "";
		for(T element : q) {
			temp = temp + element + "\n";
		}
		return temp;
	}
}
public DynamicQueue() {
	int front = 0;
	int back = 0;
}
