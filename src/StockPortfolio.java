import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {

    static ArrayList<Stock> list = new ArrayList<>();
    static int totalValue;

    public static void printStockReport() {
        System.out.println("Stock Report : ");
        for (Stock stock : list) {
            System.out.println("Name : " + stock.getName());
            System.out.println("Number of share : " + stock.getNumberOfShare());
            System.out.println("Share price : " + stock.getSharePrice());
            System.out.println("Value : " + stock.getValue());
            System.out.println();
        }
        System.out.println("Total value of all stocks : " + totalValue);
    }

    public static void computeValue(Stock stock){
        stock.setValue(stock.getNumberOfShare()*stock.getSharePrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of stocks : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of stock" + i + " -");
            System.out.print("Enter name of stock : ");
            String name = sc.nextLine();
            System.out.print("Enter no of share : ");
            int noOfShare = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter share price : ");
            int sharePrice = sc.nextInt();
            sc.nextLine();
            Stock stock = new Stock(name, noOfShare, sharePrice);
            list.add(stock);
            computeValue(stock);
            totalValue += stock.getValue();
            System.out.println();
        }
        printStockReport();
    }
}
