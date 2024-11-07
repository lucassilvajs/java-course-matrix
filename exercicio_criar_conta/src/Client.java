public class Client {
    private String name;
    private String accontNumber;
    private double balance;

    public Client() {}

    public Client(String name, String accontNumber, double balance) {
        this.name = name;
        this.accontNumber = accontNumber;
        deposit(balance);
    }

    public Client(String name, String accontNumber) {
        this.name = name;
        this.accontNumber = accontNumber;
    }

    public String toString() {
       return "Conta: "
               + this.getAccontNumber()
               +" Cliente: "
               + this.getName()
               + ", Saldo inicial: R$" + String.format("%,.2f", this.getBalance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccontNumber() {
        return accontNumber;
    }

    public void withdraw(double amount) {
        if(amount > 0) this.balance -= (amount + 5);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
