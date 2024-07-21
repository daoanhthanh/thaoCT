package lectures.generic;

// TODO: ôn lại về interface, các function của nó
interface Animal {
  abstract void greet();
}

class Human implements Animal {

  @Override // Không cần cũng được, phần mềm vẫn chạy đúng trong phần lớn trường hợp.
  public void greet() { // todo: sửa thành private và hướng dẫn về cách đọc hiểu
    System.out.println("Xin chào mọi người!");
  }

  public String toString() {
    return "Đây là con người";
  }
}

class Dog implements Animal {

  @Override
  public void greet() {
    System.out.println("Gâu gâu gâu gâu!");
  }

  public String toString() {
    return "Đây là con chó";
  }
}

class Test<T> {
  T obj;

  Test(T obj) {
    this.obj = obj;
  }

  public void printCurrentObject() {
    System.out.println(obj.toString());
  }
}

public class Main {

  public static void main(String[] args) {

    Animal a = new Dog();

    a.greet();

    Test<Animal> testObj = new Test<Animal>(a);

    testObj.printCurrentObject();

  }

}
