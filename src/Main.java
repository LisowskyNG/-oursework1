import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee("Сатанов", "Дэвил", "Чёртович", 3, 12_000);
        Employee person2 = new Employee("Козюлькин", "Порфирий", "Дормидонтович", 1, 9_000);
        Employee person3 = new Employee("Раев", "Ангел", "Херувимович", 2, 10_000);
        Employee person4 = new Employee("Утин", "Адольф", "Алоизович", 4, 15_000);
        Employee person5 = new Employee("Прекрасная", "Елена", "Батьковна", 1, 8_000);
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

        Service minSalary = new Service();
        Service maxSalary = new Service();

        System.out.println("Минимальная зарплата в месяц " + minSalary.minSalary(employee) + " руб.");
        System.out.println("Максимальная зарплата в месяц " + maxSalary.maxSalary(employee) + " руб.");
        System.out.println();

        int averageSalary = montlySalary.montlySalary(employee) / employee.length;
        System.out.println("Среднемесячная зарплата составляет " +averageSalary+ " руб.");
        System.out.println();

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getLastName() +" "+ employee[i].getName() +" "+ employee[i].getMiddleName());
        }
        Service object = new Service ();


        int indexSalary = 20;
        // Задаем параметр индексации в %
        for (int i = 0; i < employee.length; i++) {
            int newSalary = Service.indexSalary(employee, indexSalary, i);
            employee [i].setSalary(newSalary);
        }
        System.out.println();
        //for (int i = 0; i < employee.length; i++) {
        //    System.out.println(employee[i]);
        //}






    }



}