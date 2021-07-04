package designpatterns.abstractfactory2;

public class HaierFactory implements AbstractFactory{
    public AbstractTV createTV(){
        return new HaierTV();
    }

    public AbstractFridge createFridge() {
        return new HaierFridge();
    }

    public AbstractAircon createAircon(){
        return new HaierAircon();
    }

}
