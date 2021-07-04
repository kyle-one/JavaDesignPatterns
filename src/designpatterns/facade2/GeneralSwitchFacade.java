package designpatterns.facade2;

import java.util.ArrayList;
import java.util.List;

public class GeneralSwitchFacade {
    private AbstractDevide tv;
    private AbstractDevide fan;
    private AbstractDevide aircon;
    private List<AbstractDevide> lights= new ArrayList();

    public GeneralSwitchFacade(){
        tv=new Television();
        fan=new Fan();
        aircon=new AirConditioner();
        for(int i=0;i<3;i++){
            lights.add(new Light(i));
        }
    }
    public void on(AbstractDevide de){
        de.on();

    }
    public void off(AbstractDevide de){
        de.off();

    }

    public AbstractDevide getTv() {
        return tv;
    }

    public void setTv(AbstractDevide tv) {
        this.tv = tv;
    }

    public AbstractDevide getFan() {
        return fan;
    }

    public void setFan(AbstractDevide fan) {
        this.fan = fan;
    }

    public AbstractDevide getAircon() {
        return aircon;
    }

    public void setAircon(AbstractDevide aircon) {
        this.aircon = aircon;
    }

    public List<AbstractDevide> getLights() {
        return lights;
    }

    public void setLights(List<AbstractDevide> lights) {
        this.lights = lights;
    }
}
