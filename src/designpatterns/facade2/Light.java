package designpatterns.facade2;

public class Light implements AbstractDevide{
    private int id=0;
    public void on() {
        System.out.println("light "+id+" is on now");
    }

    public void off() {
        System.out.println("light "+id+" is off now");
    }
    Light(int id1){
        id=id1;
    }
}
