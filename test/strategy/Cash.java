package test.strategy;

public class Cash implements PaymentImpl {

  @Override
  public void pay(Integer payAmount, Integer productAmount) {
    System.out.println("현금 금액 확인: " + payAmount);
    System.out.println("잔돈 확인: " + (payAmount - productAmount));
  }
}
