public class Interface {
    public static void main(String[] args) {
        Person p = new Person();
        p.speak();
    }
}

// 接口规范
interface IPerson {
    void eat();

    void running();

    // 接口默认实现(继承该接口却未实现该方法时，会使用default方法体)
    default void speak() {
        System.out.println("I like studding");
    };
}

// 接口继承接口
interface IStudent extends IPerson {
    void reading();

    void studing();
}

// 继承接口
class Person implements IStudent {
    public void eat() {
    }

    public void running() {

    }

    public void speak() {
        System.out.println("running");
    }

    public void reading() {

    }

    public void studing() {

    }
}