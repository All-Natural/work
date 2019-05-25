package package1;
import package1.student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class person {
    public void setperson(String name, char gender) {
        this.gender = gender;
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    public void getperson(){
        this.getName();
        this.getGender();
    }
    /**   public person(String x,char g){
        name=x;
        gender=g;
    }**/

    /**public void show(){
        System.out.println("name:"+name+'\n'+
                "gender:"+gender);
    }**/
    private String name;
    private char gender;
    public static void main(String[] args) {
        List<student> all=new ArrayList<student>();
        student a=new student();
    a.show();
    }
}


