public class backtrack {
    public static void main(String[] args) {
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

    }
}
