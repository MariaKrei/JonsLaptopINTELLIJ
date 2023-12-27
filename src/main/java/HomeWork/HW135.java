package HomeWork;

public   class HW135 {
    public String surroud(String s, String s1){

        String c = s.replaceAll(s1, "("+s1+")");



        return c;
    }
//"("+c+")"
    public static void main(String[] args) {
        HW135 n=new HW135();
       String  b= n.surroud("MamaEva","a");

        System.out.println(b );
    }
}
