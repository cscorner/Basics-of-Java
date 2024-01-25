abstract class Bike
{  
	  abstract void run();  
}  
class HondaAbstraction extends Bike
{  
	void run()
	{
		System.out.println("running safely..");
	}  
	public static void main(String args[])
	{  
	 	Bike obj = new Honda4();  
	 	obj.run();  
	}  
}  
