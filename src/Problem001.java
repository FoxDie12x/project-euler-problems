public class Problem001 {
    public static void main(String[] args) {
        /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.
         */
        int sum = 0;
        for (int x = 0; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
