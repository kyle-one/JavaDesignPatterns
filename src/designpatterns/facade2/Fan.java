package designpatterns.facade2;

public class Fan implements AbstractDevide{
    private int id=1;

    public void on() {
        System.out.println("fan is on now");
    }

    public void off() {
        System.out.println("fan is off now");
    }
}
