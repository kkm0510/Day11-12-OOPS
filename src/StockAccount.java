import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

    private static class Info{
        String buySellStatus;
        String compSymbol;
        Integer amountOfShares;

        Info(String buySellStatus, String compSymbol, Integer amountOfShares){
            this.buySellStatus=buySellStatus;
            this.compSymbol=compSymbol;
            this.amountOfShares=amountOfShares;
        }
    }

    static ArrayList<CompanyShare> listOfCompanies=new ArrayList<>();
    String fileName;
    ArrayList<Info> file;

    public StockAccount(String fileName){
        this.fileName=fileName;
        file=new ArrayList<>();
    }

//    public double valueOf(){
//
//    }

    public void buy(int amount, String symbol){
        for(CompanyShare company:listOfCompanies){
            if(company.getStockSymbol().equals(symbol)){
                if(amount> company.totalShares){
                    System.out.println("Order cancelled as total shares available to buy = "+company.totalShares);
                    return;
                }
                company.totalShares-=amount;
            }
        }
        Info info =new Info("Buy", symbol, amount);
        file.add(info);
    }

    public void sell(int amount, String symbol){
        for(CompanyShare company:listOfCompanies){
            if(company.getStockSymbol().equals(symbol)){
                company.totalShares+=amount;
            }
        }
        Info info =new Info("Sell", symbol, amount);
        file.add(info);
    }

    public void save(String fileName){

    }

    public void printReport(){

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of companies : ");
        int noOfCompanies=sc.nextInt();
        for(int i=0; i<noOfCompanies; i++){
            System.out.print("enter company symbol : ");
            String symbol=sc.nextLine();
            System.out.println("enter total no of shares of company : ");
            int totalNoOfShares=sc.nextInt();
            CompanyShare company=new CompanyShare(symbol, totalNoOfShares);
            listOfCompanies.add(company);
        }
        System.out.print("Enter name of person/file : ");
        StockAccount account=new StockAccount(sc.nextLine());
        account.buy(10, "Adani");
        account.sell(8, "Adani");
        account.buy(20, "Reliance");
        account.buy(30, "AAdani");
    }

}
