import java.util.ArrayList;

public class PriorityQueue<T>{
	private ArrayList<T> q = new ArrayList<T>();
	public PriorityQueue() {
		
	}
	public boolean isEmpty() {
		return q.isEmpty();
	}
	public void pop() {
		if(!isEmpty())
			q.remove(0);
	}
	public T peek() {
		if(!isEmpty())
			return q.get(0);
		return null;
	}
	public void push(T element, int pos) {
		if(isEmpty())
			pos = 0;
		if(q.size() < pos)
			pos = q.size();	
		q.add(pos, element);
	}
}
