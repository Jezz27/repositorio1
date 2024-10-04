public class fibonacci {
    public static void main(String[] args) {
        long num1 = 0, num2 = 1;
        final int CANTIDAD_FIBONACCI = 50;
        System.out.println("Los primeros 50 números de la sucesión de Fibonacci son:");

        System.out.print(num1 + ", ");

        for (int i = 1; i < CANTIDAD_FIBONACCI; i++) {
            System.out.print(num2);

            if (i != 49) {
                System.out.print(", ");
            }

            long nextNum = num1 + num2;
            
            num1 = num2;
            num2 = nextNum;
        }
    }
}