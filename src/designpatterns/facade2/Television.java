package designpatterns.facade2;

public class Television implements AbstractDevide{
    public void on() {
        System.out.println("tv is on now");
    }

    public void off() {
        System.out.println("tv is off now");
    }
}
