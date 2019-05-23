package package1;
import package1.person;
import package1.academy;
import package1.Class;
import package1.grade;
import package1.teacher;
import package1.university;
public class Class extends academy
{
    public Class(int x,String b,String d)
    {
        super(b,d);
        c = x;
    }
    public void show(){
        super.show();
        System.out.println("class:"+c);
    }
    private int c;
}

