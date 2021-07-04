//designpatterns.singleton.Client.java
package designpatterns.singleton2;

//客户端测试类
public class Client {
	public static void main(String args[]) {
		//创建4个Multition对象
		Multition multition1,multition2,multition3,multition4,multition5;
		multition1 = Multition.getMultition();
		multition2 = Multition.getMultition();
		multition3 = Multition.getMultition();
		multition4 = Multition.getMultition();
		multition5 = Multition.getMultition();
	}
}