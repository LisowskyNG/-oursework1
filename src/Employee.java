public class Employee {
    //private static int id;
    private String lastName;
    private String name;
    private String middleName;
    private int department;
    private int salary;
    private static int idCount = 1;
    private int id;


    public Employee (String lastName, String name, String middleName, int department, int salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Введите корректный номер отдела");
        }
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
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
               return lastName + " " + name + " " + middleName + ". " +
                "Отдел № " + department + ". " +
                "Оклад " + salary + " руб. " +
                "id= " + id;



    }
}
