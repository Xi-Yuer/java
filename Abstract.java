public class Abstract {
    public static void main(String[] args) {

    }
}

// 抽象类（抽象类不能被实例化，只能用于继承）
abstract class Person {
    // 抽象方法（抽象方法必须在抽象类中）
    public abstract void run();
}

class Student extends Person {
    // 子类必须实现抽象父类的抽象方法
    // @Override
    public void run() {
    }
}
