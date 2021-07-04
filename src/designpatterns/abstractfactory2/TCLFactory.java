package designpatterns.abstractfactory2;

public class TCLFactory implements AbstractFactory{
    public AbstractTV createTV(){
        return new TCLTV();
    }

    public AbstractFridge createFridge() {
        return new TCLFridge();
    }

    public AbstractAircon createAircon(){
        return new TVLAircon();
    }
}
