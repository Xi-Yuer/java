public class Overload {
    public static void main(String[] args) {
        Person p = new Person();
        p.hi("Tome");
        p.hi("Sily", 16);
    }
};

class Person {

    // 方法重载
    public void hi(String name) {
        System.out.println("hi " + name);
    }

    public void hi(String name, int age) {
        System.out.println("hi " + name + " you are " + age);
    }
}
