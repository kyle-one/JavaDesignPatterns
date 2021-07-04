package designpatterns.factorymethod2;

public class TCLTVFactory implements TVFactory{
    public TV createTV(){
        TV tv= new TCLTV();
        return tv;
    }
}
