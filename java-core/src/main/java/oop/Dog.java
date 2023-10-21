package oop;

public class Dog extends Animal {

  public Dog(String name) {

    super(name);
  }

  @Override
  void say() {

    System.out.println("woof-woof");
  }

  void jump(String meters) {

    System.out.printf("Dog jumps on " + meters + " meters");
  }

  void jump(int meters) {

    System.out.printf("Dog jumps on " + meters + " meters");
  }
}
