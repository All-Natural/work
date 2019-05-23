package package1;
import package1.person;
import package1.academy;
import package1.Class;
import package1.grade;
import package1.teacher;
import package1.university;
public class academy extends university
{

    public academy(String a,String b){
        super(b);
        Academy=a;
    }
    public void show(){
        super.show();
        System.out.println("package1.academy:"+Academy);
    }
    private String Academy;
}
