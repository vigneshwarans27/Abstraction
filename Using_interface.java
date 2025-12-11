package Abstraction;

	interface animall{
		void sound();
	}
	
	class cat implements animall{
		public void sound() {
			System.out.println("cat meows");
		}
	}

public class Using_interface {

	public static void main(String[] args) {
		animall a = new cat();
		
		a.sound();

	}

}
