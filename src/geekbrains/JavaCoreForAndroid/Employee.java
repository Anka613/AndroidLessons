package geekbrains.JavaCoreForAndroid;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    Double salary;
    Integer age;

    public Employee(String fullName, String position, String email, String phone, Double salary, Integer age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    /*public static void showInfo(String fullName, String position, String email, String phone, int salary, int age){
        System.out.println("Имя сотрудника: " + fullName);
        System.out.println("Возраст: " + age);
        System.out.println("Занимаемая должность: " + position);
        System.out.println("Зарплата: " + salary);
        System.out.println("Телефон: " + phone);
        System.out.println("Email: " + email);
        System.out.println();
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
