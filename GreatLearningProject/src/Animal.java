class Animal{
       void move(){
	      System.out.println("Animal can move");
		  }

	void eat() {
		// TODO Auto-generated method stub
		
	}
}
	 class Dog extends Animal{
	   public void move(){
	   System.out.println("Dogs can walk and run");
	   }

	 public static void main(String args[]){
	   Animal a = new Animal();
	   Animal b = new Dog();//upcasting
	   a.eat();
	   b.eat();
	   }
}
