public class Override {
    public static void main(String[] args) {
        Student s = new Student();
        s.run();
    }
}

class Person {
    public void run() {
        System.out.println("running");
    }
}

class Student extends Person {
    // 重写 多态
    public void run() {
        System.out.println("Running");
    }
}
