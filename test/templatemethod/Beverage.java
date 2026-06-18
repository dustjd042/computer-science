package test.templatemethod;

public abstract class Beverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    inCup();
  }

  private void boilWater() {
    System.out.println("Boiling water");
  }

  protected abstract void brew();

  private void inCup() {
    System.out.println("Beverage in to cup");
  }

}
