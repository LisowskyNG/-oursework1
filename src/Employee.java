public class Employee {
    //private static int id;
    private String lastName;
   String name;
    private final String middleName;
    private int department;
    private int salary;
    private static int idCount = 1;
    private final int id;


    public Employee (String lastName, String name, String middleName, int department, int salary) {

            if (department < 1 || department > 5) {
                System.out.println("Введите корректный номер отдела");
            } else
                this.lastName = lastName;
                this.name = name;
                this.middleName = middleName;
                this.department = department;
                this.salary = salary;
                this.id = idCount;
                idCount++;
            //System.out.println("id = " + id);
            //System.out.println("idCount = " + idCount);
        }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public static int getIdCount() {
        return idCount;
    }
    public int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
