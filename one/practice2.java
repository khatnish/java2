package one;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalA();
CalB(5,5);
int C1 = CalC(2,2);
System.out.println(C1);
int C2 = CalC(5,5);
System.out.println(C2);
	}
	
	
	static void CalA() {
		System.out.println(1+1);
	}
	
	
	
//with parameter and without return
	
	static void CalB(int x, int y) {
		System.out.println(x+y);
	}
	// with parameter with return
	static int CalC(int x, int y) {
		return x+y;
	}
	
	

}

