package ir.sample.DesignPatternTemplate1;

public class HousingClient
    {
        public static void main(String[] args)
            {
                HouseTemplate houseType;

                System.out.println("Glass House:");
                houseType = new GlassHouse();
                houseType.buildHouse();
                System.out.println("--------------------");
                System.out.println("Wooden House:");
                houseType = new WoodenHouse();
                houseType.buildHouse();
            }

    }
