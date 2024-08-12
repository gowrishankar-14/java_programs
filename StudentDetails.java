class Student
{
    static int rollno;
    static String name;
    static float mark;

    Student(int regno,String names,float marks)
    {
        this.rollno=regno;
        this.name=names;
        this.mark=marks;
    } 

    public void display()
    {
        System.out.print(this.rollno+" ");
        System.out.print(this.name+" ");
        System.out.print(this.mark+" ");
        System.out.println();
    }
}

public class StudentDetails
{
    public static void main(String[] args)
    {
        Student dharsan=new Student(14,"Dharsan.M.B",8.35f);
        dharsan.display();
        Student elango=new Student(21,"Elango.V",8.21f);
        elango.display();
        Student john=new Student(41,"John Rohith Midhun",8.5f);
        john.display();
        Student hari=new Student(30,"Hari.N",8.4f);
        hari.display();
        
    }
}
