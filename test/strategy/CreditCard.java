package test.strategy;

public class CreditCard implements PaymentImpl {

  @Override
  public void pay(Integer payAmount, Integer productAmount) {
    System.out.println("카드사 결제 요청");
  }
}
