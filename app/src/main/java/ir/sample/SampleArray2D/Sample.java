package ir.sample.SampleArray2D;


public class Sample
{
    public int[][] arrInteger;

    public Sample()
    {

        arrInteger = new int[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                arrInteger[i][j] = i + j;

                System.out.println("Row :" + i);
                System.out.println("Column :" + j);
                System.out.println("Sum Row & Column :" + arrInteger[i][j]);
                System.out.println("-------------------");

            }
        }
    }

    public Sample(int qtyRow, int qtyClumn)
    {

        arrInteger = new int[qtyRow][qtyClumn];
        for (int i = 0; i < qtyRow; i++)
        {
            for (int j = 0; j < qtyClumn; j++)
            {
                arrInteger[i][j] = i + j;

                System.out.println("Row :" + i);
                System.out.println("Column :" + j);
                System.out.println("Sum Row & Column :" + arrInteger[i][j]);
                System.out.println("-------------------");

            }
        }
    }

}
