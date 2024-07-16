public class Part_05 {
    /** Listing 23.3 Find GCD for integers m and n */
    //Assume m > n
    public static long gcd(long m, long n) {
        long gcd = 1;
        if (m % n == 0)
            return n;
        for (long k = n / 2; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }

    /** Listing 23.4 Find GCD for integers m and n */
    //Assume m > n
    public static long gcdEuc(long m, long n) {
        if (m % n == 0)
            return n;
        else
            return gcdEuc(n, m % n);
    }

    public static void main(String[] args) throws Exception {
        long startTime;
        long endTime;
        long executionTime;
        long[] fibonacciNum = new long[46];
        fibonacciNum[0] = 0;
        fibonacciNum[1] = 1;

        //this for loop will will assign fib numbers to array
        for (int i = 2; i <= 45; i++) {
            fibonacciNum[i] = fibonacciNum[i - 1] + fibonacciNum[i - 2];
        }

        //this for loop will get fib numbers from index 40 to 45
        for (int i = 40; i < 45; i++) {
            long firstNum = fibonacciNum[i];
            long secondNum = fibonacciNum[i + 1];

            //update startTime
            startTime = System.nanoTime();

            long gcdOut = gcd(secondNum, firstNum);

            //set endTime
            endTime = System.nanoTime();
            //calculate executionTime
            executionTime = endTime - startTime;

            //display the execution time for finding the GCD for two consecutive fibonacci numbers in nanoseconds
            System.out.println("GCD1 of " + firstNum + " and " + secondNum + ": " + gcdOut);
            System.out.println("Total execution time1: " + (executionTime) + " nanoseconds");
            System.out.println();


            //gcdEuclidean
            //update startTime
            startTime = System.nanoTime();

            gcdOut = gcdEuc(secondNum, firstNum);

            //set endTime
            endTime = System.nanoTime();
            //calculate executionTime
            executionTime = endTime - startTime;

            //display the execution time for finding the GCD for every two consecutive fibonacci numbers in nanoseconds
            System.out.println("GCD2 of " + firstNum + " and " + secondNum + ": " + gcdOut);
            System.out.println("Total execution time2: " + (executionTime) + " nanoseconds");
            System.out.println();
        }
    }
}
