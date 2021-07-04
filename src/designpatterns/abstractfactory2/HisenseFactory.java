package designpatterns.abstractfactory2;

public class HisenseFactory implements AbstractFactory{
    public AbstractTV createTV(){
        return new HisenseTV();
    }

    public AbstractFridge createFridge() {
        return new HisenseFridge();
    }

    public AbstractAircon createAircon(){
        return new HisenseAircon();
    }

}
