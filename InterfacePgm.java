interface Animals
{
    String name="";
    String behaviour="";
    int lifespawn=0;
    
    void runnable();
    
    void flyable();
    
    void swimmable();
}

class Peacock implements Animals
{
    @Override

    public void runnable()
    {
        System.out.println("I can Walk,Run");
    }
    
    public void flyable()
    {
        System.out.println("I can Fly ");
    }
    
    public void swimmable()
    {
        System.out.println("I Can't Swim ");
    }
}

class Dog implements Animals
{
    public void runnable()
    {
        System.out.println("I can Walk ,Run");
    }
    
    public void flyable()
    {
        System.out.println("I can't fly");
    }
    
    public void swimmable()
    {
        System.out.println("I can Swim ");
    }
}


public class InterfacePgm
{
	public static void main(String[] args) 
	{
		Peacock ob=new Peacock();
		Dog ob2=new Dog();
		
		ob.runnable();
		ob.flyable();
		ob.swimmable();
		
		ob2.runnable();
		ob2.flyable();
		ob2.swimmable();
	}
}
