public class Employee {
    //private static int id;
    private String lastName;
   String name;
    private String middleName;
    private int department;
    private int salary;
    private static int idCount = 1;
    int id;

        public Employee (String lastName, String name, String middleName, int department, int salary) {
            //if (lastName == null || name == null || middleName == null || department < 1
            //        || department > 5 || salary == 0) {
            if (department < 1 || department > 5 || salary == 0) {
                System.out.println("Введите корректные данные");
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

}
