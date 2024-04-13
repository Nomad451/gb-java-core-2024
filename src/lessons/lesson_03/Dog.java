package lessons.lesson_03;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println(getName() + " barks");
    }

}
