public class Service {

    public int montlySalary(Employee employee []) {
        int mSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            mSalary = mSalary + employee[i].getSalary();
                    }
        //return employee;
        return mSalary;
    }

}
