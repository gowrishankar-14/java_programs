class A
{
    int a=10;
    int b=20;
    
    void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    
    void sub(int a,int b)
    {
        int diff=a-b;
        System.out.println("Difference: "+diff);
    }
    
}

class B extends A
{
    int c=30;
    int d=40;
    
    void mul(int c,int d)
    {
        int prod=c*d;
        System.out.println("Product: "+prod);
        super.add(c,d);
    }
    
    void div(int c,int d)
    {
        int div=c/d;
        System.out.println("Division: "+div);
    }
    
    void add(int b,int a)
    {
        int sum2=a+b;
        System.out.println("Overloaded Sum: "+sum2);
        super.sub(34,4);
        super.add(c,d);
    }
    
    
}

public class Inheritance
{
public static void main (String[] args)
{
   A obA=new A();
   B obB=new B();
   
   obA.add(40,50);
   obA.sub(40,50);
   
   obB.mul(60,70);
   obB.div(60,70);
   obB.add(5,6);
   
}
}
