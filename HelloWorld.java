import java.util.Arrays;

// import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // #region
        // int x = 100;
        // System.out.println(x);
        // x = 200;
        // System.out.println(x);

        // int n = x ;
        // System.out.println(n);
        // n = 500;
        // System.out.println(n);

        // int i3 = 2_000_000_000;

        // System.out.println(i3);

        // float f1 = 3.14f;
        // System.out.println(f1);

        // char a = 'A';
        // System.out.println(a);

        // 常量
        // final double PI = 3.1415926;
        // System.out.println(PI);

        // 使用var定义的变量会自动进行类型推导
        // var bar = 'A';
        // System.out.println(bar);

        // int i = (100 + 200) * (99 * 98);
        // System.out.println(i);

        // int i = 10 % 5;
        // System.out.println(i);

        // int i = 10;
        // System.out.println(i++);
        // System.out.println(++i);
        // System.out.println(i);
        // #endregion

        // #region
        // Scanner scaner = new Scanner(System.in);
        // System.out.print("input your lastScore:");
        // int lastScore = scaner.nextInt();

        // System.out.print("input your curScore:");
        // int curScore = scaner.nextInt();

        // scaner.close();

        // double percent = lastScore / curScore * 100;

        // System.out.print(percent);
        // #endregion

        // #region
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("input your score: ");
        // int Score = scanner.nextInt();
        // scanner.close();

        // if (Score < 60) {
        // System.out.println("成绩不合格");
        // } else if (Score >= 60 && Score < 85) {
        // System.out.println("成绩合格");
        // } else if (Score >= 85 && Score <= 100) {
        // System.out.println("成绩优秀");
        // } else {
        // System.out.println("成绩有误");
        // }
        // #endregion

        // #region
        // Scanner scanner = new Scanner(System.in);
        // String likedFruit = scanner.nextLine();
        // scanner.close();
        // switch (likedFruit) {
        // case "apple":
        // System.out.println("你喜欢的水果是: " + likedFruit);
        // break;
        // default:
        // System.out.println("我也不知道你喜欢什么");
        // }
        // #endregion

        // #region
        // Java 14
        // Scanner scanner = new Scanner(System.in);
        // String likedFruit = scanner.nextLine();
        // scanner.close();
        // switch (likedFruit) {
        // case "apple" -> System.out.println("你喜欢的水果是: " + likedFruit);
        // default -> System.out.println("我也不知道你喜欢什么");
        // }
        // #endregion

        // #region
        // int n = 100;
        // int m = 0;
        // while(n >= 1){
        // m += n;
        // n--;
        // }
        // System.out.println(m);
        // #endregion

        // #region
        // for (int i = 1; i < 10; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.printf(j + "*" + i + "=" + j * i + " ");
        // if (j > i)
        // break;
        // }
        // System.out.print("\n");
        // }
        // #endregion

        // #region

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int sum = 0;
        // for (int i : arr) {
        // sum += i;
        // }
        // System.out.print(sum);
        // #endregion

        // #region
        // int[] ns = { 1, 4, 9, 16, 25 };
        // for (int i = ns.length; i > 0; i--) {
        // // System.out.print(i);
        // System.out.print(ns[i-1] + " ");
        // }

        // System.out.print(ns); // [I@4517d9a3 打印数组的内存地址

        // System.out.print(Arrays.toString(ns)); 将数组转为字符串打印
        // #endregion

        // #region
        // int[] ns = { 28, 4, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // // 冒泡排序
        // for (int i = 0; i <= ns.length - 1; i++) {
        //     for (int j = i + 1; j <= ns.length - 1; j++) {
        //         if (ns[i] > ns[j]) {
        //             int tem = ns[i];
        //             ns[i] = ns[j];
        //             ns[j] = tem;
        //         } else {
        //             break;
        //         }
        //     }
        // }
        // ;
        // System.out.println(Arrays.toString(ns));
        // #endregion
            
        System.out.println(Arrays.toString(args));
    }
}