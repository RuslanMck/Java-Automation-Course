public class Buyer {

    private int money;

    public Buyer(int money){
        this.money = money;
    }

    public void spendMoney(int moneyToSpend){
        money = money - moneyToSpend;
    }
}
