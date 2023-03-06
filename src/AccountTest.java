import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance : ");
        Account account = new Account(sc.nextInt());
        while (true) {
            System.out.print("Want to debit money? (1)Yes (2)No : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter debit amount : ");
                int debitAmount = sc.nextInt();
                if (debitAmount <= account.getBalance()) {
                    account.debit(debitAmount);
                } else {
                    System.out.println("Debit amount exceeded account balance");
                    break;
                }
            }
        }
    }
}
