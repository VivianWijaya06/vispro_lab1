abstract class Animal {
  void animalSound();

  void sleep() {
    print("Zzz");
  }
}

class Pig extends Animal {
  @override
  void animalSound() {
    print("The pig says: wee wee");
  }
}
