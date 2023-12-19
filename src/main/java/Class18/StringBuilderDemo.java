package Class18;

public class StringBuilderDemo {


        public static void main(String[] args) {


            String str="hello";
            System.out.println(str.concat("And Welcome"));


            StringBuilder sb=new StringBuilder("Hello");
            sb.append("and welcome");
            System.out.println(sb);
        }}

