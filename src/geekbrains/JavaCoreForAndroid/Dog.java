package geekbrains.JavaCoreForAndroid;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    final int maxRunDistance = 500;
    final int maxSwimDistance = 10;

    @Override
    void run(int runDistance) {
        if (runDistance <= maxRunDistance){
            System.out.println(getName() + " пробежал " + runDistance + " метров!");
        } else System.out.println("Собаки не могут пробежать больше " + maxRunDistance + " метров =(");
    }

    @Override
    void swim(int swimDistance) {
        if (swimDistance <= maxSwimDistance){
            System.out.println(getName() + " проплыл " + swimDistance + " метров!");
        } else System.out.println("Собаки не могут плавать больше " + maxSwimDistance + " метров =(");
    }
}
