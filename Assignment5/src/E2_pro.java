public class E2_pro {
    public static void main(String[] args)
    { E2 account=new E2(1000);
        account.deposit(500);
        account.withdraw(1000);
    account.addintrest(50);
    account.mystery(account,250);
    System.out.println(account.getbalance());
    }
}