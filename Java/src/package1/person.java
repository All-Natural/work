package package1;
import package1.student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
        List<student> all=new ArrayList<student>();
        student a=new student(2018213879,13061802,2018,"董一英",'f',"软件工程","重庆邮电大学","陈阔",'m');
    a.show();
    }
}


