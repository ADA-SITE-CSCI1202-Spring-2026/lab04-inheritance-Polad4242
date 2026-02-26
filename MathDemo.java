public class MathDemo {

    // a) Return minimum of two numbers
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // b) Return maximum of two numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // c) Return sum of array elements
    public int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i];
        }
        return total;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        MathDemo math = new MathDemo();

        System.out.println("Min: " + math.min(5, 3));
        System.out.println("Max: " + math.max(5, 3));

        int[] numbers = {1, 2, 3, 4};
        System.out.println("Sum: " + math.sum(numbers));
    }
}