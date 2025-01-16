package Question46.rad;

import Question46.com.Helper;

public class Stock {
    Stock stock;
    public void  StockQuote(Stock s)
    {

    }
    public double computePrice()
    {
        return Helper.getPricer(stock).price();
    }
    
}
