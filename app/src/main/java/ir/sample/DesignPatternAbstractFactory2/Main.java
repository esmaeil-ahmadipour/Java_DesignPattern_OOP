package ir.sample.DesignPatternAbstractFactory2;

public class Main
{
    public static void main(String[] args)
    {
        MainFactory mainFactoryBuildingBody = FactoryProducer.getFactory("BODY");
        MainFactory mainFactoryColoringBody = FactoryProducer.getFactory("COLOR");
        MainFactory mainFactoryDesigningEngine = FactoryProducer.getFactory("ENGINE");

        Body bodySample = mainFactoryBuildingBody.getBody("Tiggo");
        Engine engineSample = mainFactoryDesigningEngine.getEngine("Tiggo");
        Color colorSample =mainFactoryColoringBody.getColor("White");

        engineSample.DesignEngine();
        bodySample.BuildingBody();
        colorSample.Coloring();

    }
}
