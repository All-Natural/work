package package1;

public class student extends person {
        public student(int l,int x,int y,String z,char i,String h,String k,String n,char o)//学号,班级，年级，姓名，性别，学院，大学,老师姓名性别
        {
            super(z,i);
            id=l;
            a=new package1.Class(x,h,k);
            b=new grade(y);
            c=new teacher(n,o);
        }
        public void show(){
            System.out.println("id:"+id);
            a.show();
            b.show();
            c.show();
        }

        int id;
        private package1.Class a;
        private grade b;
        private teacher c;
}
