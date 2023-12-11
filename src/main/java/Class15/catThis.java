package Class15;

public class catThis {
    private String name;
    private String color;
    private int age;
    public catThis(String cName, String cColor, int cAge){
        name=cName;
        color=cColor;
        age=cAge;

    } public void PrintInfo(){
        System.out.println(name+color+age);
    }

    public static void main(String[] args) {
        catThis c=new catThis("Kitti", "White",13);
        c.PrintInfo();
    }
}
