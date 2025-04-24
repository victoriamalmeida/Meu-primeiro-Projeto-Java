package BankAccount;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance = 0.0;
    static int totalAccounts = 0;
    public static final String BANK_NAME = "Banco do Brasil - BB";
    private double lastDeposit = 0.0;
    private double lastWithdraw = 0.0;

    static {
        System.out.println("Sistema iniciado!");
    }

    public BankAccount (String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public BankAccount (){
        this("Usuário não identificado.", 0000);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    boolean deposit (double value){
        if (value > 0) {
            balance += value;
            lastDeposit = value;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    boolean withdraw (double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            lastWithdraw = value;
            return true;
        } else {
            System.out.println("ERRO SAQUE: Valor inválido ou SALDO INSUFICIENTE!\n");
            return false;
        }
    }


    void showInfo () {
        System.out.println("Banco: " + BankAccount.BANK_NAME);
        System.out.println();
        System.out.println("Nome do usuário: " + accountHolder);
        System.out.println("Número da conta: " + accountNumber);
        System.out.printf("Saldo da conta: R$%.2f\n", balance);
        System.out.println();
        System.out.printf("Último depósito realizado: R$%.2f\n", lastDeposit);
        System.out.printf("Último saque realizado: R$%.2f\n", lastWithdraw);
        System.out.println();
    }

}
