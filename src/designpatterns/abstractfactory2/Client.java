//designpatterns.abstractfactory.Client.java
package designpatterns.abstractfactory2;

public class Client {
	public static void main(String args[]) {
		AbstractFactory factory1;
		AbstractFridge fridge;
		AbstractTV tv;
		AbstractAircon aircon;
		factory1=(AbstractFactory) XMLUtil.getBean();
		fridge=factory1.createFridge();
		tv=factory1.createTV();
		aircon=factory1.createAircon();
		tv.play();
		fridge.play();
		aircon.play();
	}
}