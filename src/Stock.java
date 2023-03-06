public class Stock {

    private String name;
    private int numberOfShare;
    private int sharePrice;
    private int value;

    Stock(String name, int numberOfShare, int sharePrice){
        this.name=name;
        this.numberOfShare=numberOfShare;
        this.sharePrice=sharePrice;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
