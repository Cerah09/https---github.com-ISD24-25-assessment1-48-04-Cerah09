import java.util.Stack;


public class Rekursif {
    static Stack<Integer> stack = new Stack<>();

    
    public static void recursionStep(int n) {
        if (n == 1) {
            System.out.println("Faktorial 1 disimpan");
            System.out.println("Recursion step dijalankan");
            System.out.println("Base case faktorial 1");
            return;
        }

        System.out.println("Faktorial " + n + " disimpan");
        System.out.println("Recursion step dijalankan");
        stack.push(n);
        recursionStep(n - 1);
    }

   
    public static void backtrack() {
        System.out.println();
        System.out.println("Mengembalikan nilai base case : faktorial 1");

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("Mengembalikan ke Faktorial " + value);
        }
    }

    public static void main(String[] args) {
        int input = 4;
        System.out.println("Simulasi rekursif faktorial : " + input);
        System.out.println();

        recursionStep(input);
        backtrack();
    }
}
