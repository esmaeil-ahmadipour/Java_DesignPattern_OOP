package ir.sample.DesignPatternTemplate1;

public class WoodenHouse extends HouseTemplate
    {
        @Override
        public void buildPillars()
            {
                System.out.println("Building Pillars with Wood coating");
            }

        @Override
        public void buildWalls()
            {
                System.out.println("Building Walls with Wood");
            }
    }
