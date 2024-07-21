//package lectures.generic;
//
//interface Animal {
//}
//
//class Human implements Animal {
//
//  public String toString() {
//    return "Đây là con người";
//  }
//}
//
//class Dog implements Animal {
//  public String toString() {
//    return "Đây là con chó";
//  }
//}
//
//class Test<T> {
//  T obj;
//
//  Test(T obj) {
//    this.obj = obj;
//  }
//
//  public void printCurrentObject() {
//    System.out.println(obj.toString());
//  }
//}
//
//public class MainClean {
//
//  public static void main(String[] args) {
//
//    // Animal a = new Dog();
//
//    Test<String> testObj = new Test<String>("Xin chao ahihi");
//
//    testObj.printCurrentObject();
//
//  }
//
//}
