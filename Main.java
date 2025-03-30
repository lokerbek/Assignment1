public class Main {

    public static int task1(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.min(arr[index], task1(arr, index + 1));
    }

    public static double task2(int[] arr, int index, int length) {
        if (index == arr.length) {
            return 0;
        }
        return (double) arr[index] / length + task2(arr, index + 1, length);
    }

    public static String task3(int n) {
        return check(n, 2) ? "Prime" : "Composite";
    }

    private static boolean check(int n, int d) {
        if (n < 2) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return check(n, d + 1);
    }

    public static int task4(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * task4(n - 1);
    }

    public static int task5(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return task5(n - 1) + task5(n - 2);
    }

    public static int task6(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * task6(a, b - 1);
    }

    public static void task7(String str, String pre) {
        if (str.isEmpty()) {
            System.out.println(pre);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            task7(str.substring(0, i) + str.substring(i + 1), pre + str.charAt(i));
        }
    }

    public static String task8(String str) {
        if (str.isEmpty()) {
            return "No";
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static int task9(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return task9(n - 1, k - 1) + task9(n - 1, k);
    }

    public static int task10(int a, int b) {
        if (b == 0) {
            return a;
        }
        return task10(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 1, 32, 3, 45};
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Task 1: " + task1(arr1, 0));
        System.out.println("Task 2: " + task2(arr2, 0, arr2.length));
        System.out.println("Task 3.1: " + task3(7));
        System.out.println("Task 3.2: " + task3(10));
        System.out.println("Task 4: " + task4(5));
        System.out.println("Task 5.1: " + task5(5));
        System.out.println("Task 5.2: " + task5(17));
        System.out.println("Task 6: " + task6(2, 10));
        System.out.println("Task 7: ");
        task7("IOX", "");
        System.out.println("Task 8.1: " + task8("123456"));
        System.out.println("Task 8.2: " + task8("123a12"));
        System.out.println("Task 9.1: " + task9(2, 1));
        System.out.println("Task 9.2: " + task9(7, 3));
        System.out.println("Task 10.1: " + task10(32, 48));
        System.out.println("Task 10.2: " + task10(10, 7));
    }
}
