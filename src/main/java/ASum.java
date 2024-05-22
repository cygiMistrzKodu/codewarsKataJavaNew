public class ASum {

    public static long findNb(long m) {

        long n = 0;
        long sumOfCubes = 0;
        while (sumOfCubes < m) {
            n++;
            sumOfCubes += (long) Math.pow(n, 3);
        }

        if (sumOfCubes > m) {
            return -1L;
        }

        return n;
    }
}