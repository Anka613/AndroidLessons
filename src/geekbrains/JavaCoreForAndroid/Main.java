package geekbrains.JavaCoreForAndroid;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Петров Сидр Борисович", "Директор", "sidr@gmail.com", "+7(903)1943288", 50000.00, 55);
        employeeArray[1] = new Employee("Васильев Маг Леонидович", "Психиатр", "mag333@gmail.com", "+7(903)1943288", 70000.00, 40);
        employeeArray[2] = new Employee("Петров Василий Сидрович", "Стажёр", "son@gmail.com", "+7(903)7132943", 13000.00, 23);
        employeeArray[3] = new Employee("Яснополе Леонид Петрович", "Почтальон", "yasnoponyatno@gmail.com", "+7(903)2849912", 5000.00, 15);
        employeeArray[4] = new Employee("Ожидань Елена Пилатовна", "Бухгалтер", "helena@gmail.com", "+7(903)3947327", 150000.00, 35);

        /*for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age >= 40){
                Employee.showInfo(
                    employeeArray[i].fullName,
                    employeeArray[i].position,
                    employeeArray[i].email,
                    employeeArray[i].phone,
                    employeeArray[i].salary,
                    employeeArray[i].age
                );
            }
        }*/

        final int maxAge = 40;

        for (Employee employee: employeeArray) {
            if (employee.getAge() >= maxAge){
                System.out.println(employee.toString());
            }
        }
    }
}
