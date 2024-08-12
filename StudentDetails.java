class Student
{
     int rollno;
     String name;
     float mark;

    Student(int regno,String names,float marks)
    {
        this.rollno=regno;
        this.name=names;
        this.mark=marks;
    } 

    boolean CheckMark()
    {
        if(this.mark>=35)
        {
            return true;
        }
        else
        {
            return false;
        }
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
        Student dharsan=new Student(14,"Dharsan.M.B",5f);
        dharsan.display();
        Student elango=new Student(21,"Elango.V",38.21f);
        elango.display();
        Student john=new Student(41,"John Rohith Midhun",38.5f);
        john.display();
        Student hari=new Student(30,"Hari.N",8.4f);
        hari.display();
        dharsan.CheckMark();
        elango.CheckMark();
    }
}