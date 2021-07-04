package designpatterns.facade2;

public class AirConditioner implements AbstractDevide{
    public void on() {
        System.out.println("aircon is on now");

    }

    public void off() {
        System.out.println("aircon is off now");
    }
}
