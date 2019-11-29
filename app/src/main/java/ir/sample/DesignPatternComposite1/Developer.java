package ir.sample.DesignPatternComposite1;

public class Developer implements Employee
{
    private String employeeName;
    private long employeeID;
    private String employeePosition;

    public Developer(long employeeID, String employeeName, String employeePosition)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Detail Employee : [ Name: "+employeeName+" , ID: "+employeeID+" , Position: "+employeePosition+" ]");
    }
}
