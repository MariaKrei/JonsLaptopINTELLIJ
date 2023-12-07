package Class12;

public class BoyGirl {
    public static void main(String[] args) {
        String fatherNmae="Henry";
        String motherName="Maria";
        boolean isBoy=false;
        if (isBoy){
            String fatherFirstPart=fatherNmae.substring(0,fatherNmae.length()/2);
            String motherNameLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart+motherNameLastPart.trim());

        }else {
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherNmae.substring(fatherNmae.length()/2,fatherNmae.length());
            System.out.println(motherFirstPart+fatherNmae.trim());

        }
    }
}
