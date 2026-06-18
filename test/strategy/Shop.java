package test.strategy;

public class Shop {

  public void checkOut(PaymentImpl payment, Integer payAmount, Integer productAmount) {
    payment.pay(payAmount, productAmount);
  }
}
