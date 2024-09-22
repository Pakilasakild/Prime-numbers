public class Main {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int primes = 0;
        for (int i = 0; i <= 1000; i++) {
            if (primes == 3) {
                break;
            } else if (isPrime(i)) {
                System.out.println(i);
                primes++;
            }
        }
    }
}