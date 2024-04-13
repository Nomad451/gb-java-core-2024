package lessons.lesson_03;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println(getName() + " meows");
    }

}
