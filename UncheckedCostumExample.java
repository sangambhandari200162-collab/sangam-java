class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String message){
        super(message);
    }
}
public class UncheckedCostumExample {
    static void withdraw(double amount){
        if (amount<0){
            throw new InvalidAmountException("amount cannot be negative");

        }
        System.out.println("Withdraw Amount:"+amount);
    }
    public static void main(String[] args) {
        withdraw(-400);
    }
    
}
