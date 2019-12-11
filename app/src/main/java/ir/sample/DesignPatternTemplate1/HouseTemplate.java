package ir.sample.DesignPatternTemplate1;

public abstract class HouseTemplate
    {
        public final void buildHouse()
            {
                buildFoundation();
                buildPillars();
                buildWalls();
                buildWindows();
                System.out.println("House in built.");
            }

        // DEFAULT IMPLEMENTATION
        private void buildFoundation()
            {
                System.out.println("Building foundation with cement,iron rods and sand.");
            }

        // IMPLEMENTATION BY SUBCLASSES
        public abstract void buildPillars();

        public abstract void buildWalls();

        // DEFAULT IMPLEMENTATION
        private void buildWindows()
            {
                System.out.println("Building Glass Windows.");
            }

    }
