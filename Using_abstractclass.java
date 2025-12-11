package Abstraction;

	abstract class animal{
		abstract void sound();
		void sleep() {
			System.out.println("animal is sleeping");
		}
	}
	
	class dog extends animal{
		void sound() {
			System.out.println("dog barks");
		}
	}

public class Using_abstractclass {

	public static void main(String[] args) {
		animal a = new dog();
		
		a.sound();
		a.sleep();

	}

}
