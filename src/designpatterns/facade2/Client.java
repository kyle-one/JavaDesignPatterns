//designpatterns.facade.Client.java
package designpatterns.facade2;

import designpatterns.facade2.XMLUtil;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String args[]) {
		AbstractDevide fan=new Fan();
		AbstractDevide tv=new Television();
		AbstractDevide aircon=new AirConditioner();
		AbstractDevide light0=new Light(0);
		AbstractDevide light1=new Light(1);
		AbstractDevide light2=new Light(2);
		List<AbstractDevide> lights=new ArrayList();
		lights.add(light0);
		lights.add(light1);
		lights.add(light2);
		
		GeneralSwitchFacade swtich;// = new GeneralSwitchFacade();
		swtich=(GeneralSwitchFacade) XMLUtil.getBean();
		swtich.setTv(tv);
		swtich.setAircon(aircon);
		swtich.setFan(fan);
		swtich.setLights(lights);

		swtich.on(tv);
		swtich.off(light2);
	}
}
