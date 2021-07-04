package designpatterns.observer2;

import java.util.ArrayList;
import java.util.List;

public class Stock implements AbstractStock{
    private List<Investor> investorList=new ArrayList();
    private double price;
    private String stockName;
    public void addInvestor(Investor p1){
        investorList.add(p1);
    }
    public void removeInvestor(Investor p1){
        investorList.remove(p1);

    }
    public void notifyInvestor(double oldPrice,double newPrice){
        for(int i=0;i<investorList.size();i++){
            investorList.get(i).response(stockName,oldPrice,newPrice);
        }
    }

    public List<Investor> getInvestorList() {
        return investorList;
    }

    public void setInvestorList(List<Investor> investorList) {
        this.investorList = investorList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(Math.abs(price-this.price)/this.price>=0.05){
            notifyInvestor(this.price,price);
        }
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
