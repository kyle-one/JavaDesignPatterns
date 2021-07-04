package designpatterns.observer2;

public interface AbstractStock {

    public void addInvestor(Investor p1);
    public void removeInvestor(Investor p1);
    public void notifyInvestor(double oldPrice,double newPrice);
}
