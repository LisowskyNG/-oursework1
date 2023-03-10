import java.util.Arrays;
import java.util.Scanner;

public class Service {

    public int montlySalary(Employee employee []) {
        int mSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            mSalary = mSalary + employee[i].getSalary();
                    }
        return mSalary;
    }

    public int minSalary(Employee employee[]) {
        int min = montlySalary(employee);
        for (int i = 0; employee.length > i; i++) {
            if (min > employee[i].getSalary()) {
                min = employee[i].getSalary();
            }
        }
        return min;

    }

    public int maxSalary(Employee employee[]) {
        int max = 0;
        for (int i = 0; employee.length > i; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
            }
        }
        return max;
    }





}
