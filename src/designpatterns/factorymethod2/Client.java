//designpatterns.factorymethod.Client.java
package designpatterns.factorymethod2;

public class Client {
	public static void main(String args[]) {
		TVFactory factory1;
		TV tv;
		factory1=(TVFactory) XMLUtil.getBean();
		tv= factory1.createTV();
		tv.play();
	}
}