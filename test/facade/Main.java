package test.facade;

public class Main {

  public static void main(String[] args) {
    Light light = new Light();
    Security security = new Security();
    Home home = new Home(light, security);

    home.returnHome();
    home.leaveHome();
  }
}
