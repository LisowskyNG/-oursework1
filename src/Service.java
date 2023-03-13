import java.util.Arrays;
import java.util.Scanner;

public class Service {

    public int montlySalary(Employee employee[]) {
        int mSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            mSalary = mSalary + employee[i].getSalary();
        }
        return mSalary;
    }

    public int minSalary(Employee employee[]) {
        int min = montlySalary(employee);
        int iD = 0;
        for (int i = 0; employee.length > i; i++) {
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
                iD = employee[i].getId();
            }

        }
        return iD;

    }

    public int maxSalary(Employee employee[]) {
        int max = 0;
        int iD = 0;
        for (int i = 0; employee.length > i; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
                iD = employee[i].getId();
            }
        }
        return iD;
    }


    public static int indexSalary(Employee employee[], int indexSalary, int i) {

        int newSalary = employee[i].getSalary() + employee[i].getSalary() * indexSalary / 100;

        return newSalary;
    }

    public static Employee [] arrayToDepartment (Employee employee[], int departmentNumber) {

        int countDepartment = 0; // Обнуляем счетчик

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                countDepartment++;
            }
        }

        Employee[] oneDepartmentArr = new Employee[countDepartment];
        //System.out.println(oneDepartmentArr.length);
        countDepartment = 0;

        for (int j = 0; j < employee.length; j++) {
            if (employee[j].getDepartment() == departmentNumber) {
                oneDepartmentArr[countDepartment] = employee[j];
                countDepartment++;
            }
        }
        return oneDepartmentArr;
    }




}

