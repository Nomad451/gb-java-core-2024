package seminars.seminar_03;

public class Employee {

    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private int salary;
    private int age;
    private int bDay;
    private int bMonth;
    private int birth;

    public Employee(String name, String midName, String surName, String position, String phone, int salary, int age) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(int bDay, int bMonth, int birth) {
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.birth = birth;
    }

    // Метод повышающий зарплату на определенную сумму
    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    // Повышает зарплату в зависимости от возраста
    public static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].increaseSalary(increment);
            }
        }
    }

    // Вывод информации в консоль
    public void info() {
        System.out.println("Employee:\n {" +
                "name = '" + name + '\'' +
                ", midName = '" + midName + '\'' +
                ", surName = '" + surName + '\'' +
                ", position = '" + position + '\'' +
                ", phone = '" + phone + '\'' +
                ", salary = " + salary +
                ", age = " + getAge() +
                '}');
    }

    // Форматированная информация
    @Override
    public String toString() {
        return String.format("Employee {" +
                        "name = '%s', midName = '%s', surName = '%s'" +
                        ", position = '%s', phone = '%s'" +
                        ", salary = %d, age = %d}'",
                name, midName, surName, position, phone, salary, getAge());
    }

    public int getAge() {
        return age;
    }

    // Прототип компаратора
    public int compare(int dd, int mm, int yyyy) {
        int empl = bDay + (bMonth << 6) + (birth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return empl - income;
    }
}


