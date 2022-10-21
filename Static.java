public class Static {
    public static void main(String[] args) {
        System.out.println(Person.name);

        // Person p = new Person();
        // 不能通过实例访问静态方法或属性
        // System.out.println(p.name);
    }
}

class Person {
    public static String name = "Tom";
}