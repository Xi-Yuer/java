public class Main {
    public static void main(String[] args) {
        Person p = new Person("Tom", 8);
        String name = p.getName();
        int age = p.getAge();

        Person p1 = new Person("Sily", 16, 165);
        float height = p1.getHeight();

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

class Person {
    private String name;
    private int age;
    private float height;

    // 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    };

    // 多个构造方法
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    };

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }
}