public class E2 {
    private double balance;
    public E2(){ balance=0;
    }
    public E2(double initial){ balance=initial;
    }
    public void mystery(E2 that,double amount) { this.balance-=amount; that.balance+=amount; }
    public void deposit(double amount){ balance+=amount; }
    public void withdraw(double amount){ if(amount<=balance) balance-=amount; }
    public void addintrest(double rate){ balance+=(rate/100)*balance; }
    public double getbalance(){ return balance; }
}
