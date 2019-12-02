package ir.sample.DesignPatternCommand1;

public class DinnerOrder implements Order
{
private CookingStaff cookingStaff ;

    public DinnerOrder(CookingStaff cookingStaff)
    {
        this.cookingStaff = cookingStaff;
    }

    @Override
    public void execute()
    {
     cookingStaff.cookDinner();
    }
}
