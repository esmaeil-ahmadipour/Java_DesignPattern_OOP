package ir.sample.DesignPatternComposite1;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails()
    {
        for (Employee employee : employeeList)
        {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }
}
