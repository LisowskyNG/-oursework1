public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees [0] = new Employee("Сатанов", "Дэвил", "Чёртович", 3, 12_000);
        employees [1] = new Employee("Козюлькин", "Порфирий", "Дормидонтович", 5, 9_000);
        employees [2] = new Employee("Раев", "Ангел", "Херувимович", 2, 10_000);
        employees [3] = new Employee("Утин", "Адольф", "Алоизович", 5, 7_000);
        employees [4] = new Employee("Прекрасная", "Елена", "Батьковна", 4, 8_000);
        employees [5] = new Employee("Нескончаемый", "Поток", "Мыслевич", 2, 15_000);
        employees [6] = new Employee("Бэйсик", "Фортран", "Ассемблерович", 1, 10_000);
        employees [7] = new Employee("Хорватов", "Йобан", "Маттиевович", 3, 9_000);
        employees [8] = new Employee("Чык-Чырык", "Батька", "Грыгорыч", 5, 16_000);
        employees [9] = new Employee("Стаканова", "Валентина", "Матвеевна", 5, 14_000);


        System.out.println("===========Задания на базовый уровнь=============");
        System.out.println();
        printEmploee();
        System.out.println("Сумма затрат на зарплаты в месяц " +montlySalary()+ " руб.");
        System.out.println("=================================================");
        System.out.println("Минимальная зарплата в месяц " +minSalary());
        System.out.println("=================================================");
        System.out.println("Максимальная зарплата в месяц " +maxSalary());
        System.out.println("=================================================");
        System.out.println("Средняя зарплата в месяц " +averageSalary());
        System.out.println("=================================================");
        printFio();
        System.out.println("=================================================");
        System.out.println();
        System.out.println("==========Задания повышенной сложности============");
        System.out.println();
        indexSalaryL2(3); // задаем процент на который надо проиндексировать зарплату и вызываем метод
        System.out.println("=================================================");
        // задаем параметр номер отдела для чего определим переменную
        int department = 5;

        System.out.println("Работник с минимальной зарплатой в отделе № " +department+ " " +minSalaryL2(department).getLastName()+
                " " +minSalaryL2(department).getName()+ " " +minSalaryL2(department).getMiddleName()+ ". С зарплатой "
                +minSalaryL2(department).getSalary()+ " руб");

        System.out.println("Работник с максимальной зарплатой в отделе № " +department+ " " +maxSalaryL2(department).getLastName()+
                " " +maxSalaryL2(department).getName()+ " " +maxSalaryL2(department).getMiddleName()+ ". С зарплатой "
                +maxSalaryL2(department).getSalary()+ " руб");
        System.out.println("Сумма затрат на зарплату в отделе № " +department+ " составляет " +montlySalaryL2(department)+ " руб в месяц");

        System.out.println("Средняя зарплата в отделе № " +department+ " составляет " +averageSalaryL2(department)+ " руб в месяц");

        System.out.println();
        indexSalaryL2(10, department);

        System.out.println("=================================================");
        System.out.println("Список сотрудников отдела №" +department);
        printFioL2(department);
        System.out.println("=================================================");
        int number = 12_000; // задаем параметр для сравнения зарплат
        peopleLessSalary(number);
        System.out.println("=================================================");
        peopleExtraSalary(number);
    }
    static void printEmploee () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static int montlySalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    static Employee minSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    static Employee maxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    static double averageSalary(){
        return (double) montlySalary()/employees.length;
    }

    static void printFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " "
                    + employee.getName() + " " + employee.getMiddleName());
        }

    }
    // Повышенная сложность
    static void indexSalaryL2 (int index) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary()*index/100);
            System.out.println("Зарплата сотрудника " +employee.getLastName()+ " после индексации на " +index+ "%, равна "
                    + employee.getSalary()+ " руб");
        }
    }


    static Employee minSalaryL2(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department){
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    static Employee maxSalaryL2(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }
    static int montlySalaryL2(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    static double averageSalaryL2(int department){
        int peopleInDept = 0;
        //double average = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                peopleInDept++;
            }
        }
        return (double) montlySalaryL2(department)/peopleInDept;
    }

    static void indexSalaryL2 (int index, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index / 100);
                System.out.println("Зарплата сотрудника " + employee.getLastName() + " после индексации на " + index + "%, равна "
                        + employee.getSalary() + " руб");
            }
        }
    }
    static void printFioL2(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getLastName()+ " "
                        +employee.getName() + " " +employee.getMiddleName()+ ". Зарплата " +employee.getSalary()+
                        " руб. Id = " +employee.getId());
            }
        }

    }

    static void peopleLessSalary(int number) {
        System.out.println("Список сотрудников с зарплатой меньше " +number);
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("Id " +employee.getId()+ " " +employee.getLastName()+ " " +employee.getName()+ " " +employee.getMiddleName()
                        +" Зарплата " +employee.getSalary());

            }
        }
    }
    static void peopleExtraSalary(int number) {
        System.out.println("Список сотрудников с зарплатой больше или равно " +number);
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println("Id " +employee.getId()+ " " +employee.getLastName()+ " " +employee.getName()+ " " +employee.getMiddleName()
                        +" Зарплата " +employee.getSalary());

            }
        }
    }

}