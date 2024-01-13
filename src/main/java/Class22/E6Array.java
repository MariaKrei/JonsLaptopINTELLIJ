package Class22;

import java.util.ArrayList;

public class E6Array {
    public static void main(String[] args) {
        ArrayList<String> planes=new ArrayList<>();
        planes.add("Cessna");
        planes.add("Saratoga");
        planes.add("Piper");
        planes.add("Gulfstream");
        System.out.println(planes.isEmpty());
        System.out.println(planes.contains("Piper"));
        System.out.println(planes.size());
        System.out.println(planes);
    }
}
