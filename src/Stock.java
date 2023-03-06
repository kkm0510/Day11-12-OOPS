public class Stock {

    String name;
    int numberOfShare;
    int sharePrice;
    int value;

    Stock(String name, int numberOfShare, int sharePrice){
        this.name=name;
        this.numberOfShare=numberOfShare;
        this.sharePrice=sharePrice;
        computeTotalValue();
    }

    public void computeTotalValue(){
        value=numberOfShare*sharePrice;
    }
}
