package ch01.apps;

public class ackerman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ack(1,2));
		System.out.println(dub_fact(5));
		System.out.println(dub_fact(7));
	}
	public static int ack(int m, int n) {
		if (m == 0) {
			return n+1;
		} else if(m>0 && n ==0) {
			return ack(m-1,1);
		} else if (m>0 && n > 0){
			return ack(m-1, ack(m, n-1));
		} else {
			return 0;
		}
	}
	public static int dub_fact(int x) {
		if(x>2) 
			return x*dub_fact(x-2);
		else 
			 return 1;
		
	}
}	
