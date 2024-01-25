import java.util.Scanner;
public class RunAnimal {
	
	public static void main (String[]args){


		System.out.println("Choose an animal.");    		
		System.out.println("Press B for Bird, C for Cat or D for Dog:");    
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine().toLowerCase();
		if (input.equals("b") )
		{
                    		Bird b = new Bird();	
			b.eat();
			b.sleep();
			b.makesound();
		}
		else if (input.equals("c") )
		{
                    		Cat  c = new Cat();	
			c.eat();
			c.sleep();
			c.makesound();
		}
		else if (input.equals("d") )
		{
                    		Dog  d = new Dog();	
			d.eat();
			d.sleep();
			d.makesound();
		}
		else
			System.out.println("No such animal....");	
		
		
		
	}
}


abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
	public abstract void makesound();
}

class Bird extends Animal{
	public void makesound(){
		System.out.println("Birds is really cute when they eating");
		
	}
	public void eat()
	{
		System.out.println("Birds Eating...");
	}
	public void sleep()
	{
		System.out.println("Birds Sleeping...");
	}
	
}

class Cat extends Animal {
	public void makesound(){
		System.out.println("Cat is really clingy when you treat them properly");
	}
	public void eat()
	{
		System.out.println("Cat Eating...");
	}
	public void sleep()
	{
		System.out.println("Cat Sleeping...");
	}
}
 class Dog extends Animal{
	public void makesound(){
		System.out.println("Dog is a Mans bestfriend");	
	}
	public void eat()
	{
		System.out.println("Dog Eating...");
	}
	public void sleep()
	{
		System.out.println("Dog Sleeping...");
	}
}