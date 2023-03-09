
public class Main {
    public static void main(String[] args) {
        Employee item1 = new Employee("Сатанов", "Дэвил", "Чёртович", 3, 10_000);
        System.out.println("Employee.name = " + item1.name);
        System.out.println("item1.id = " + item1.id);

        Employee item2 = new Employee("Дракулов", "Люцифер", "Кровососович", 2, 15_000);
        System.out.println("Employee.name = " + item2.name);
        System.out.println("item2.id = " + item2.id );


    }

}