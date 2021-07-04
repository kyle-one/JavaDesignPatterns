package designpatterns.factorymethod2;

public class HaierTVFactory implements TVFactory{
    public TV createTV(){
        TV tv= new HaierTV();
        return tv;
    }

}
