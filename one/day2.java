package one;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1. function with parameter and without return
		
Cal(2,3);

//2.without parameter with out return
Cal2();
		
		
		}
	//without parameter and without return
static void Cal(int x, int y) {
	System.out.println(x+y);
	
	
	//3. with parameter and with return
	int A1 = Add(12,3);
	System.out.println(A1);
	
	
	
	
	
}
//2. function without parameter and without return
static void Cal2() {
	System.out.println(12+8);
	
}

//3.function with parameter and with return

static int Add(int x, int y) {
	return x+y;
}
	
	
	
	
}