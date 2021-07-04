package designpatterns.observer2;

import java.util.ArrayList;
import java.util.List;

public class Investor implements AbstractInvestor{
    private List<Stock> stockList=new ArrayList();
    private String investorName;
    public void response(String stockName,double oldPrice,double newPrice){
        System.out.println(investorName+":"+stockName+"  old price:"+oldPrice+"  new price:"+newPrice);
    }
    public void addStock(Stock p1){
        stockList.add(p1);

    }
    public void removeStock(Stock p1){
        stockList.remove(p1);

    }
    public List<Stock> getStockList() {
        return stockList;
    }
    public String getInvestorName() {
        return investorName;
    }
    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }
    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

}
