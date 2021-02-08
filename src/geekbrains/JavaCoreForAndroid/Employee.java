package geekbrains.JavaCoreForAndroid;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    Integer salary;
    Integer age;

    public Employee(String fullName, String position, String email, String phone, Integer salary, Integer age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void showInfo(String fullName, String position, String email, String phone, int salary, int age){
        System.out.println("Имя сотрудника: " + fullName);
        System.out.println("Возраст: " + age);
        System.out.println("Занимаемая должность: " + position);
        System.out.println("Зарплата: " + salary);
        System.out.println("Телефон: " + phone);
        System.out.println("Email: " + email);
        System.out.println();
    }
}
