package be.ac.umons;

public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int amount() {

        return this.amount;
    }

    public String currency(){

        return this.currency;
    }

    public Money add(Money m) throws Exception{

        if (this.currency().equals(m.currency()))
        {
            return new Money(this.amount()+m.amount(), this.currency());
        }
        throw new Exception("Not Same currency");
    }

    public Money add(int amount, String currency) throws Exception
    {
        return this.add(new Money(amount,currency));
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
