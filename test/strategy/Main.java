package test.strategy;

public class Main {

  public static void main(String[] args) {
    Shop shop = new Shop();
    System.out.println("=== 현금 결제 ===");
    shop.checkOut(new Cash(), 1000, 100);

    System.out.println("=== 신용카드 결제 ===");
    shop.checkOut(new CreditCard(), 100, 100);
  }
}
