package chapter5;

public class InterfaceExample {
	public static final int i=6;
	
	//before java 8
	public abstract void m();
	void m1();
	
	//before java 8
		 static void m3() {
			 System.out.println();
		 }
		default void m4() {
			System.out.println();
		}
	}
interface A extends InterfaceExample{
	
}