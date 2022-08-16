import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Eagle(), new Shark(), new Turtle(), new Eagle(), new Turtle(), new Eagle()};
        for (Animal a : animals) {
            if (a instanceof Shark) ((Shark) a).attack();
            else if (a instanceof Turtle) ((Turtle) a).swim();
            else ((Eagle) a).fly();
        }
        Shark[] sharks = new Shark[10];
        Turtle[] turtles = new Turtle[10];
        Eagle[] eagles = new Eagle[10];
        for (Animal a : animals) {
            if (a instanceof Shark) for (int i = 0; i < sharks.length; i++) {
                if (sharks[i] == null) {
                    sharks[i] = (Shark) a;
                    break;
                }
            }
            else if (a instanceof Turtle) for (int i = 0; i < turtles.length; i++) {
                if (turtles[i] == null) {
                    turtles[i] = (Turtle) a;
                    break;
                }
            }
            else for (int i = 0; i < eagles.length; i++) {
                    if (eagles[i] == null) {
                        eagles[i] = (Eagle) a;
                        break;
                    }
                }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }
}
