package Review10;

public interface Washable {
    void wash();
    public static final int age=20;

}
class Horse implements Washable, TrustAble{
    @Override
    public void wash() {
        System.out.println("Wash the horse");
    }

    @Override
    public void trust() {
        System.out.println("cars are trusted");
    }
}
interface TrustAble{
    void trust();
}
class Car implements Washable, TrustAble{
    @Override
    public void wash() {
        System.out.println("wash a car");
    }
    public void trust(){
        System.out.println("Horses can be trusted");
    }
}
class LapTop{}