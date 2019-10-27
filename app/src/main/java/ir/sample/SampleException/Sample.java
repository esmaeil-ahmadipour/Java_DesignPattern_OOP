package ir.sample.SampleException;

public class Sample
{
int age;
    public int getAge()
    {
        return age;
    }

    public void setAge(int age) throws CustomException
    {
       if(age<0)
           throw new CustomException();
        this.age = age;
    }
}
