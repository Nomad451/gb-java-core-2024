package lessons.lesson_03;

public class Snake extends Animal {

    public Snake(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void move() {
        System.out.println(getName() + " crawls");
    }

    @Override
    void voice() {
        System.out.println(getName() + " hisses");
    }
}
