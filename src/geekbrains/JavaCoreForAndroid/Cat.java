package geekbrains.JavaCoreForAndroid;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    final int maxRunDistance = 500;

    @Override
    void run(int runDistance) {
        if (runDistance <= maxRunDistance){
            System.out.println(getName() + " пробежал " + runDistance + " метров!");
        } else System.out.println("Коты не могут пробежать больше " + maxRunDistance + " метров =(");
    }

    @Override
    void swim(int swimDistance) {
        System.out.println("Коты не умеют плавать =(");
    }
}
