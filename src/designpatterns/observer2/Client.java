//designpatterns.observer.Client.java
package designpatterns.observer2;

public class Client {
	public static void main(String args[]) {
		Stock xiaomiStock=new Stock();
		Stock huaweiStock=new Stock();
		Investor investor1=new Investor();
		Investor investor2=new Investor();

		xiaomiStock.setStockName("xiaomi");
		xiaomiStock.setPrice(100);
		huaweiStock.setStockName("huawei");
		huaweiStock.setPrice(500);

		investor1.setInvestorName("Yongkun Liu");
		investor2.setInvestorName("Storm Xu");
		xiaomiStock.addInvestor(investor1);
		huaweiStock.addInvestor(investor2);

		xiaomiStock.setPrice(20);
		huaweiStock.setPrice(100);
	}
}
