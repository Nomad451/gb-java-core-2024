package seminars.seminar_04;

// Перечисление гендеров
enum Genders {
    MALE, FEMALE
}

public class Employee {
    private String name;
    private String midName;
    private String surName;
    private String phone;
    private String position;
    private int salary;
    private int birth;
    Genders gender;

    public Employee(String name, String midName, String surName, String phone, String position,
                    int salary, int birth, Genders gender) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.birth = birth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

}
