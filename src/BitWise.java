public class BitWise {
    public int divideBy2(int x) {
        return x >> 1;

    }

    public int multiplyBy2(int x) {
        return x << 1;
    }

    public int log2(int x) {
        int res = 0;
        while ((x >>= 1) != 0)
            res++;

        return res;
    }
}
