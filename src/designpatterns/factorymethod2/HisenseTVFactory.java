package designpatterns.factorymethod2;

public class HisenseTVFactory implements TVFactory{
    public TV createTV(){
        TV tv= new HisenseTV();
        return tv;
    }
}
