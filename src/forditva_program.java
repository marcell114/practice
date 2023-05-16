class Forditva {
    public static void main(String[] args) {
        int A;
        int B;
        // While ciklussal
        /*
         * int A = 1;
         * while (A < 10) {
         * int B = 0;
         * while (B < 10) {
         * System.out.print(A);
         * System.out.print(B);
         * System.out.print(A);
         * System.out.println(" ");
         * B++;
         * }
         * A++;
         * }
         */
        // ugyan ez for ciklussal
        for (A = 1; A < 10; A++) {
            for (B = 0; B < 10; B++) {
                System.out.print(A * 100 + B * 10 + A + " ");
            }
        }
    }
}