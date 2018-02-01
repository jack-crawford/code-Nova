import java.util.Queue;
import java.util.*;
public class Week02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue tunnel; //= new Queue();
		ArrayList numList = new ArrayList();
		//numList.add(7);
		//System.out.println(numList.get(0));
		
		for (int i = 1; i <20; i++) {
			if (20 % i == 0) {
				numList.add(i);
				System.out.println(i);
			}
		}
	}

}
