package sample;

public class prcts {
	public static void main (String[] args) {
		
		Dog d=new Dog();
		d.speak();
       d.bark();
	}}
	interface Animall{
		void bark();
		void speak();
	}
	class Dog implements Animall{
public void bark() {
	System.out.println("dog");
}
public void speak() {
	System.out.println("dog is barking");
}


}

