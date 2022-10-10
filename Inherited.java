public class Inherited {
    public static void main(String[] args) {
        Student s = new Student("Tom", 18);
        s.eat();
        s.run();
        System.out.println(s instanceof Person); // true
        System.out.println(s instanceof Student); // true
        System.out.println(null instanceof Object); // false
        System.out.println("str" instanceof Object); // true
        System.out.println("str" instanceof String); // true
    }
}

class Person {
    private String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    };

    public Person(String name) {
        this.name = name;
    };

    public void eat() {
        System.out.println(this.name + " " + "eatting");
    };

    public void run() {
        System.out.println(this.name + " " + "running");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        // 调用父类的构造方法
        super(name, age);
    }

    public void getName() {
        // 子类无法访问父类的私有属性
        // System.out.println(this.name);
    }

    public int getAge() {
        // 子类可以访问父类的保护类型属性
        return this.age;
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        // 调用父类的构造方法
        super(name);
    }
}
