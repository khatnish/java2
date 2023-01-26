package one;

public class classpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a = 2;
//		int b= 3;
//		int c= 4;
//		if (a>b && a>c) {
//			System.out.println("a is greater");
//		}
//		else if (b>c && b>c) {
//			System.out.println("b is greater");
//			
//		}
//		else {
//			System.out.println("c is greater");
//		}

		// with parameter with return type
		
		int A1 = calA(9,10);
		System.out.println(A1);
		calB();
		Add(1,2);
	}

	static int calA(int x, int y) {
		return (x + y);
	}
	
	//without parameter without return type
	static void calB() {
		System.out.println(3+4);
	}
	//with parameter without return type
	static void Add(int a, int b) {
		System.out.println(a+b);
	}

}
