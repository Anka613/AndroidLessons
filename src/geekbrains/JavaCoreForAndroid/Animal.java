package geekbrains.JavaCoreForAndroid;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void run(int runDistance);

    abstract void swim(int swimDistance);
}
