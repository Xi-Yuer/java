public class Abstract {
    public static void main(String[] args) {

    }
}

// 抽象类
abstract class Person {
    // 抽象方法
    public abstract void run();
}

class Student extends Person {
    // 子类必须实现抽象父类的抽象方法
    public void run() {
    }
}
