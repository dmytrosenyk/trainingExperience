package oop;

public class Dog extends Animal {

  public Dog(String name) {

    super(name);
  }

  @Override
  void say() {

    System.out.println("woof-woof");
  }
}
