import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee("Сатанов", "Дэвил", "Чёртович", 3, 12_000);
        Employee person2 = new Employee("Козюлькин", "Порфирий", "Дормидонтович", 5, 9_000);
        Employee person3 = new Employee("Раев", "Ангел", "Херувимович", 2, 10_000);
        Employee person4 = new Employee("Утин", "Адольф", "Алоизович", 4, 15_000);
        Employee person5 = new Employee("Прекрасная", "Елена", "Батьковна", 5, 8_000);
        Employee person6 = new Employee("Нескончаемый", "Поток", "Мыслевич", 2, 15_000);
        Employee person7 = new Employee("Бэйсик", "Фортран", "Ассемблерович", 4, 10_000);
        Employee person8 = new Employee("Хорватов", "Йобан", "Маттиевович", 3, 9_000);
        Employee person9 = new Employee("Чык-Чырык", "Батька", "Грыгорыч", 5, 16_000);
        Employee person10 = new Employee("Стаканова", "Валентина", "Матвеевна", 5, 14_000);

        Employee[] employee = new Employee[10];
        employee[0] = person1;
        employee[1] = person2;
        employee[2] = person3;
        employee[3] = person4;
        employee[4] = person5;
        employee[5] = person6;
        employee[6] = person7;
        employee[7] = person8;
        employee[8] = person9;
        employee[9] = person10;

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            }
        System.out.println();

        Service montlySalary = new Service();
        System.out.println("Сумма затрат на зарплаты в месяц " + montlySalary.montlySalary(employee) +" руб.");

        System.out.println();

        Service minSalaryId = new Service();
        Service maxSalaryId = new Service();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == minSalaryId.minSalary(employee)) {
                System.out.println("Минимальная зарплата в месяц " + employee[i].getSalary() + " руб.");
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == maxSalaryId.maxSalary(employee)) {
                System.out.println("Максимальная зарплата в месяц " + employee[i].getSalary() + " руб.");
            }
        }
        System.out.println();

        int averageSalary = montlySalary.montlySalary(employee) / employee.length;
        System.out.println("Среднемесячная зарплата составляет " +averageSalary+ " руб.");
        System.out.println();

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getLastName() +" "+ employee[i].getName() +" "+ employee[i].getMiddleName());
        }

        // Первое задание повышенной сложности
        int indexSalary = 20;
        // Задаем параметр индексации в %
        for (int i = 0; i < employee.length; i++) {
            int newSalary = Service.indexSalary(employee, indexSalary, i);
            employee [i].setSalary(newSalary);
        }
        System.out.println();

        // Второе задание повышенной сложности
        int departmentNumber = 5; //Задаем номер искомого отдела
        Employee [] arrayToDepartment = Service.arrayToDepartment(employee, departmentNumber);

        //for (int i = 0; i < arrayToDepartment.length; i++) {
        //System.out.println(arrayToDepartment[i]);
        //}
        //System.out.println();

        //Задание повышенной сложности 2.1
        for (int i = 0; i < arrayToDepartment.length; i++) {
            if (arrayToDepartment[i].getId() == minSalaryId.minSalary(arrayToDepartment)) {
                System.out.println("Сотрудник отдела " + departmentNumber+ " с минимальной зарплатой в месяц " +arrayToDepartment[i].getLastName()+
                " " +arrayToDepartment[i].getName()+ " " +arrayToDepartment[i].getMiddleName()+ " с окладом в "
                        + arrayToDepartment[i].getSalary() + " руб.");
            }
        }
        //Задание повышенной сложности 2.2
        for (int i = 0; i < arrayToDepartment.length; i++) {
            if (arrayToDepartment[i].getId() == maxSalaryId.maxSalary(arrayToDepartment)) {
                System.out.println("Сотрудник отдела " + departmentNumber+ " с максимальной зарплатой в месяц " +arrayToDepartment[i].getLastName()+
                        " " +arrayToDepartment[i].getName()+ " " +arrayToDepartment[i].getMiddleName()+ " с окладом в "
                        + arrayToDepartment[i].getSalary() + " руб.");
            }
        }
        System.out.println();
        // Задание повышенной сложности 2.3
        Service montlyDepartmentSalary = new Service();

        System.out.println("Сумма затрат на зарплату по отделу " + departmentNumber+ " составляет " +montlyDepartmentSalary.montlySalary(arrayToDepartment)+ " руб");

        // Задание повышенной сложности 2.4
        System.out.println("Средняя месячная зарплата по отделу " + departmentNumber+ " составляет " +(montlyDepartmentSalary.montlySalary(arrayToDepartment)/arrayToDepartment.length)+ " руб");
        System.out.println();

        // Задание повышенной сложности 2.5
        indexSalary = 20;
        // Задаем параметр индексации в %
        for (int i = 0; i < arrayToDepartment.length; i++) {
            int newSalary = Service.indexSalary(arrayToDepartment, indexSalary, i);
            arrayToDepartment [i].setSalary(newSalary);
        }
        //for (int i = 0; i < arrayToDepartment.length; i++) {
        //    System.out.println(arrayToDepartment[i]);
        //}
        //System.out.println();

        // Задание повышенной сложности 2.6
        for (int i = 0; i < arrayToDepartment.length; i++) {
            System.out.println(arrayToDepartment[i].getLastName() +" "+ arrayToDepartment[i].getName() +" "+ arrayToDepartment[i].getMiddleName()
            + ". Оклад "+arrayToDepartment[i].getSalary()+ " руб" + ", Id " + arrayToDepartment[i].getId());
        }
        //Задание повышенной сложности 3.
        // Беру на себя инициативу получить число не в качестве параметра а взять среднюю зарплату и дальше сравнивать зарплаты со средней.
        averageSalary = montlySalary.montlySalary(employee) / employee.length;
        System.out.println("Среднемесячная зарплата составляет " +averageSalary+ " руб.");
        System.out.println();

        int countExtraSalary = 0;
        int countLessSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= averageSalary) {
                countExtraSalary++;
            } else {
                countLessSalary++;
            }
        }

        //System.out.println(countLessSalary);
        //System.out.println(countExtraSalary);

        Employee [] arrayLessSalary = new Employee[countLessSalary];
        Employee [] arrayExtraSalary = new Employee[countExtraSalary];

        countExtraSalary = 0;
        countLessSalary = 0;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= averageSalary) {
                arrayExtraSalary[countExtraSalary] = employee[i];
                countExtraSalary++;
            } else {
                arrayLessSalary[countLessSalary] = employee[i];
                countLessSalary++;
            }

        }
        System.out.println("Список сотрудников с зарплатой меньше средней");
        for (int i = 0; i < arrayLessSalary.length; i++) {
            System.out.println("Id " +arrayLessSalary[i].getId()+ " " +arrayLessSalary[i].getLastName()+ " " +arrayLessSalary[i].getName()+ " "
                    +arrayLessSalary[i].getMiddleName()+ ". Зарплата - " + arrayLessSalary[i].getSalary()+ " руб." );
        }

        System.out.println();

        System.out.println("Список сотрудников с зарплатой выше средней");
        for (int i = 0; i < arrayExtraSalary.length; i++) {
            System.out.println("Id " + arrayExtraSalary[i].getId() + " " + arrayExtraSalary[i].getLastName() + " " + arrayExtraSalary[i].getName() + " "
                    + arrayExtraSalary[i].getMiddleName() + ". Зарплата - " + arrayExtraSalary[i].getSalary() + " руб.");
        }
    }
}