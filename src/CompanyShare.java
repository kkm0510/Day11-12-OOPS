public class CompanyShare {
    private final String stockSymbol;
    int totalShares;

    public CompanyShare(String stockSymbol, int totalShares) {
        this.stockSymbol = stockSymbol;
        this.totalShares = totalShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

}
