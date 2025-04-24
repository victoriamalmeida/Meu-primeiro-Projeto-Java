package BankAccount;

public class AppBankAccount {
    public static void main(String[] args) {

        BankAccount bc1 = new BankAccount();

        bc1.showInfo();

        bc1.setAccountHolder("Lázaro Souza");
        bc1.setAccountNumber(8492);
        bc1.deposit(700.00);
        bc1.withdraw(300.00);

        System.out.println();
        bc1.showInfo();

        BankAccount bc2 = new BankAccount();

        bc2.setAccountHolder("Julia Costa");
        bc2.setAccountNumber(7548);
        bc2.deposit(500.00);
        bc2.withdraw(600.00);

        System.out.println();
        bc2.showInfo();

        BankAccount bc3 = new BankAccount();

        bc3.setAccountHolder("Lucia Almeida");
        bc3.setAccountNumber(9362);
        bc3.deposit(0.00);
        bc3.withdraw(0.00);

        System.out.println();
        bc3.showInfo();

        System.out.println("Total de contas criadas no app Bancário: " + BankAccount.totalAccounts);
    }
}
