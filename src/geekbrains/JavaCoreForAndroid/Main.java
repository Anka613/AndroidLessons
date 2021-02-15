package geekbrains.JavaCoreForAndroid;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[8];
        cats[0] = new Cat("Рыжий", 4);
        cats[1] = new Cat("Боб", 11);
        cats[2] = new Cat("Пётр I", 6);
        cats[3] = new Cat("Арсений", 17);
        cats[4] = new Cat("Снежинка", 3);
        cats[5] = new Cat("Печка", 13);
        cats[6] = new Cat("Адольф", 8);
        cats[7] = new Cat("Леонтьев", 3);

        Plate plate = new Plate(40);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].toString());
            plate.info();
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    public boolean isFull;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        isFull = plate.isDecreasedFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }
}


 class Plate {
     public static final int NEW_FOOD = 100;
     private int food;

     public Plate(int food) {
        this.food = food;
    }
     public void setFood(int food) {
         this.food = food;
     }

     public int getFood() {
         return food;
     }

     public boolean isDecreasedFood(int countFood) {
         if (hasEnoughFood(countFood)){
             food -= countFood;
             return true;
         } else addFood(NEW_FOOD);
        return false;
     }

     public boolean hasEnoughFood(int countFood) {
         return food >= countFood;
     }

     public void addFood(int countFood){
         food += countFood;
     }

     public void info() {
        System.out.println("plate: " + food);
    }
}

