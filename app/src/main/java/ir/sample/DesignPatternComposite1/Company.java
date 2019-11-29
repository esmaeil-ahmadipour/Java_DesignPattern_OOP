package ir.sample.DesignPatternComposite1;

public class Company
{
    public static void main(String[] args)
    {
        Developer developer1=new Developer(101,"James McAfee","Developer");
        Developer developer2=new Developer(102,"Sam Smith","Pro Developer");
        CompanyDirectory engineerDirectory = new CompanyDirectory();
        engineerDirectory.addEmployee(developer1);
        engineerDirectory.addEmployee(developer2);

        Manager manager1= new Manager(201,"Randy Orton","SEO Manager");
        Manager manager2= new Manager(203,"Willy William","Business Manager");
        CompanyDirectory managerDirectory=new CompanyDirectory();
        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engineerDirectory);
        directory.addEmployee(managerDirectory);

        directory.showEmployeeDetails();
    }
}
