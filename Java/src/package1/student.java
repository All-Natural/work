package package1;

public class student extends person {
    public void setG(String n,char gen,GPA g,int id) {
        this.setperson(n,gen);
        this.id=id;
    }

    public GPA getG() {
        return g;
    }

    /**public void show(){
            System.out.println("id:"+id);
        }**/

        private int id;
        private GPA g;

}
