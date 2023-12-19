package HomeWork;

public class Sparrow extends Bird{

        public Sparrow(String name, double weight, int lengthOfLife, boolean isCarnivore) {
            super(name, weight, lengthOfLife, isCarnivore);
        }

        public static void main(String[] args) {
            HomeWork.Sparrow a=new HomeWork.Sparrow("Sparrow", 2, 5, false);
            a.printInfo();
        }
    }

