package test.facade;

public class Home {

  private Light light;
  private Security security;

  public Home (Light light, Security security) {
    this.light = light;
    this.security = security;
  }

  public void leaveHome() {
    System.out.println("leaveHome");
    light.off();
    security.armAway();
  }

  public void returnHome() {
    System.out.println("returnHome");
    light.on();
    security.disarm();
  }
}