package designpatterns.observer2;

public interface AbstractInvestor {
    public void response(String stockName,double oldPrice,double newPrice);
}
