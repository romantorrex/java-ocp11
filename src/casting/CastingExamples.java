package casting;

public class CastingExamples {

  public static void main(String... args) {
    A a = new B();

    C c = (C) a; // if the class C is made final, this casting will generate a compilation error.
  }
}

interface A {}

class B implements A {}

class C {}
