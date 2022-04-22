//hierarchicalInheritence
 class Animals{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dogs extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Says meow");
		
	}
}
 class hierarchialInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d1 = new Dogs();
		
		d1.bark();
		d1.eat();
	}

}