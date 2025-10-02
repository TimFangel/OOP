public class main {
    	public static void main(String[] args) { 
		A a = new B(); 
		a.m1(); 
		a.m2(); 
		((B)a).m2(); 
		A.m2(); 
		B.m2(); 
	} 
}

class A { 
	public void m1() { 
		System.out.println("A.m1()"); 
	} 
	public static void m2() { 
		System.out.println("A.m2()"); 
	} 
} 
class B extends A { 
	@Override 
	public void m1() { 
		System.out.println("B.m1()"); 
	} 
	public static void m2() { 
		System.out.println("B.m2()"); 
	} 
}