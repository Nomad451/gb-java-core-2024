package seminars.seminar_04;

enum Parties {
    NONE, NEW_YEAR, MARCH_8, FEB_23
}

public class Main {

    private static final Parties today = Parties.NEW_YEAR;

    public static void main(String[] args) {

        // Создаем сотрудников
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "developer",
                "8(495)000-11-22", 50000, 40, Genders.MALE);

        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "senior developer",
                "8(495)333-44-55", 90000, 30, Genders.FEMALE);

        // Добавляем их в массив
        Employee[] employees = {ivan, natalia};

        celebrate(employees);

    }

    // Метод, поздравляющий сотрудником с новым годом, либо с праздником на основе их пола.
    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].getName() + ", happy New Year!");
                    break;
                case FEB_23:
                    if (emp[i].gender == Genders.MALE)
                        System.out.println(emp[i].getName() + ", happy February 23rd!");
                    break;
                case MARCH_8:
                    if (emp[i].gender == Genders.FEMALE)
                        System.out.println(emp[i].getName() + ", happy march 8th!");
                    break;
                default:
                    System.out.println(emp[i].getName() + ", celebrate this morning!");
            }
        }
    }
}
