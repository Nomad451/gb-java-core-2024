package lessons.lesson_03;

public class Bird extends Animal {

    private int flyHeight;

    public Bird(String name, String color, int age, int flyHeight) {
        super(name, color, age);
        this.flyHeight = flyHeight;
    }

    @Override
    void voice() {
        System.out.println(getName() + " tweets");
    }

    void fly() {
        System.out.println(getName() + " flies at " + flyHeight + " m");
    }

}
