package seminars.seminar_03;

public class Main {
    public static void main(String[] args) {

        // Создание сотрудников
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "developer",
                "8(495)000-11-22", 50000, 40);

        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "fitter",
                "8(495)111-22-33", 52000, 22);

        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "project manager",
                "8(495)222-33-44", 40000, 75);

        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "senior developer",
                "8(495)333-44-55", 90000, 30);

        Manager tatiana = new Manager("Tatiana", "Sergeevna",
                "Krasotkina", "accountant",
                "8(495)444-55-66", 50000, 46);

        // Добавление их в массив
        Employee[] company = new Employee[5];
        company[0] = ivan;
        company[1] = andrey;
        company[2] = evgeniy;
        company[3] = natalia;
        company[4] = tatiana;

        // Инициализированный массив
        Employee[] employees = { ivan, andrey, evgeniy, natalia, tatiana };

        // Создание массива сотрудников и его заполнение без дополнительных переменных
//        Employee[] employees2 = {
//                new Employee("Ivan", "Igorevich", "Ovchinnikov", "developer",
//                "8(495)000-11-22", 50000, 1985),
//                new Employee("Andrey", "Viktorovich", "Bezrukov", "fitter",
//                        "8(495)111-22-33", 52000, 1973),
//                new Employee("Evgeniy", "Viktorovich", "Delfinov", "project manager",
//                "8(495)222-33-44", 40000, 1963),
//                new Employee("Natalia", "Pavlovna", "Keks", "senior developer",
//                "8(495)333-44-55", 90000, 1990),
//                new Employee("Tatiana", "Sergeevna", "Krasotkina", "accountant",
//                "8(495)444-55-66", 50000, 1983)
//                };

        // Сравниваем дату сотрудника с рандомной датой
        Employee empl = new Employee(5, 7, 1991);
        System.out.println(empl.compare(1, 8, 1987));

       // Повышаем зарплату сотрудникам, которые не являются руководителями
        Manager.increaser(employees, 45, 5000);

        for (int i = 0; i < employees.length; i++) {
            employees[i].info();
        }

    }
}
