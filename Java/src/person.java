public class person {
    public person(String x,char g){
        name=x;
        gender=g;
    }
    public void show(){
        System.out.println("name:"+name+'\n'+
                "gender:"+gender);
    }
    private String name;
    private char gender;
    public static void main(String[] args) {
        student a=new student(2018213879,13061802,2018,"董一英",'f',"软件工程","重庆邮电大学","陈阔",'m');
    a.show();
    }

}
//class Person
class student extends person
{
    public student(int l,int x,int y,String z,char i,String h,String k,String n,char o)//学号,班级，年级，姓名，性别，学院，大学,老师姓名性别
    {
        super(z,i);
        id=l;
        a=new Class(x,h,k);
        b=new grade(y);
        c=new teacher(n,o);
    }
    public void show()
    {
        super.show();
        System.out.println("id:"+id);
        a.show();
        b.show();
        c.show();
    }
    int id;
    private Class a;
    private grade b;
    private teacher c;
}
class teacher extends person
{
    public teacher(String n,char g){
        super(n,g);
    }
    public void show(){
        super.show();
}
}
class grade {
   private int Grade;
   public grade(int y){
       Grade=y;
   }
   public void show(){
       System.out.println("grade:"+Grade);
   }
}
class university{
    public university(String x)
    {
        univer = x;
    }
    public void show(){
        System.out.println("university:"+univer);
    }
public String univer;
}

class academy extends university
{

    public academy(String a,String b){
        super(b);
        Academy=a;
    }
    public void show(){
        super.show();
        System.out.println("academy:"+Academy);
    }
    private String Academy;
}

class Class extends academy
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

